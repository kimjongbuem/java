package TelephoneProject;

import java.util.Scanner;
public class PhoneBookManager {
	static Scanner sc = new Scanner(System.in);
	PhoneInfo[] info;
	private int count;
	PhoneBookManager(){
		info = new PhoneInfo[100];
		count = 0;
	}
	int getCount() {
		return count;
	}
	public void showMenu(boolean re) {
		if(!re)
			System.out.println("�����ϼ���...\n1. ������ �Է� \n2. ������ �˻�\n3. ������ ����\n4. ���α׷� ���� ");
		else
			System.out.println("�ٽ� �����ϼ���...\n1. ������ �Է� \\n2. ������ �˻�\\n3. ������ ����\\n4. ���α׷� ���� ");
	}
	public void readData() {
		if(count == 100){
			System.out.println("�� �̻� �����͸� �߰� �� �� �����ϴ� !");
			return;
		}
		System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		System.out.println("������ �Է��� �ּ��� : ");
		String birthday = sc.nextLine();
		PhoneInfo p;
		if(birthday == null)
			p = new PhoneInfo(name,phoneNumber);
		else
			p = new PhoneInfo(name,phoneNumber,birthday);
		System.out.println("�Էµ� ���� ���...");
		p.showTelephoneInfo();
		info[count++] = p;
	}
	public void removePhoneInfo(String name) {
		for(int i =0; i<count;i++){
			if(info[i].getName().equals(name)){
				for(int j = i;j<count;j++)
					info[j] = info[j+1];
				count--;
				return;
			}
		}// ������ //
		System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
	}
	public void searchShowInfo(String name) {
		for(int i =0; i<count;i++){
			if(info[i].getName().equals(name)){
				info[i].showTelephoneInfo();
				return;
			}
		}// ������ //
		System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
	}
}
class PhoneInfo {
	private String name;
	private String birthday;
	private String phoneNumber;
	
	PhoneInfo(String name, String phoneNumber,String birthday){
		this.name = name;
		this.phoneNumber =phoneNumber;
		this.birthday = birthday;
	}
	PhoneInfo(String name, String phoneNumber){
		this(name,phoneNumber,null);
	}
	public String getName() {
		return name;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void showTelephoneInfo() {
		if(birthday != null)
			System.out.println("�̸� : "+name+" �ڵ��� ��ȣ : "+phoneNumber+" ����: "+birthday);
		else
			System.out.println("�̸� : "+name+" �ڵ��� ��ȣ : "+phoneNumber);
	}
}