package TelephoneProject;

import java.util.Scanner;
public class PhoneBookManager {
	static Scanner sc = new Scanner(System.in);
	PhoneInfo[] info;
	private int count;
	private final int MAX_COUNT = 100;
	PhoneBookManager(){
		info = new PhoneInfo[MAX_COUNT];
		count = 0;
	}
	int getCount() {
		return count;
	}
	private int search(String name) {
		for(int idx =0; idx<count;idx++){
			if(info[idx].getName().equals(name)){
				return idx;
			}
		}
		return -1;
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
		System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
	}
	public void removePhoneInfo() {
		if(count == 0) {
			System.out.println("������ �����Ͱ� �����ϴ�");
			return;
		}
		System.out.println("������ �˻��� �����մϴ�...");
		System.out.println("�̸� :");
		String removeName = sc.nextLine();
		int idx = search(removeName);
		if(idx == -1) {// ������ //
			System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
			return;
		}
		else {
			for(int midx = idx;midx<count - 1;midx++)
				info[midx] = info[midx + 1];
		}
		System.out.println("������ ������ �Ϸ� �Ǿ����ϴ�");
		count--;
		
	}
	public void searchShowInfo() {
		if(count == 0) {
			System.out.println("ã�� �����Ͱ� �����ϴ�");
			return;
		}
		System.out.println("������ �˻��� �����մϴ�...");
		System.out.println("�̸� :");
		String searchName = sc.nextLine();
		int idx = search(searchName);
		if(idx == -1) {// ������ //
			System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
			return;	
		}
		else
			info[idx].showTelephoneInfo();
		System.out.println("������ �˻��� �Ϸ� �Ǿ����ϴ�.");
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