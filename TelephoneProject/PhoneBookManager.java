package TelephoneProject;

import java.util.Scanner;
interface SELECT_MENU{
	int INPUT = 1, SEARCH = 2, DELETE = 3, ALL_OUTPUT = 4, EXIT= 5;
}
interface SELECT_INPUT{
	int NORMAL = 1, UNIV = 2, COMPANY = 3; 
}
public class PhoneBookManager {
	static Scanner sc = new Scanner(System.in);
	boolean re = false;
	private int NOT_FOUND = -1;
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
		return NOT_FOUND;
	}
	public void showMenu(boolean re) {
		if(!re)
			System.out.println("�����ϼ���...\n1. ������ �Է� \n2. ������ �˻�\n3. ������ ����\n4. ������ ��ü���\n5. ���α׷� ���� ");
		else
			System.out.println("�ٽ� �����ϼ���...\n1. ������ �Է� \n2. ������ �˻�\n3. ������ ����\n4. ������ ��ü���\n5. ���α׷� ����");
	}
	public void showSubMenu(boolean re) {
		if(!re)
			System.out.println("1. �Ϲ�\t2. ����\t3. ȸ��");
		else
			System.out.println("�ٽ��Է��ϼ���...\t1. �Ϲ�\t2. ����\t3. ȸ��");
	}
	public void readData() {
		if(count == 100){
			System.out.println("�� �̻� �����͸� �߰� �� �� �����ϴ� !");
			return;
		}
		while(true) {
			int choice;
			showSubMenu(re);
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case SELECT_INPUT.NORMAL:
				readNormalPhoneInfo();
				return;
			case SELECT_INPUT.UNIV:
				readUnivPhoneInfo();
				return;
			case SELECT_INPUT.COMPANY:
				readCompanyPhoneInfo();
				return;
			default:
				re = true;
			}
		}
	}
	public void readNormalPhoneInfo() {
		System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		info[count]= new PhoneInfo(name,phoneNumber);
		System.out.println("�Էµ� ���� ���...");
		info[count++].showInfo();
		System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
		re = false;
	}
	public void readCompanyPhoneInfo() {
		System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		System.out.println("ȸ���̸��� �Է��� �ּ��� : ");
		String companyName = sc.nextLine();
		info[count]= new PhoneComInfo(name,phoneNumber,companyName);
		System.out.println("�Էµ� ���� ���...");
		info[count++].showInfo();
		System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
		re = false;
	}
	public void readUnivPhoneInfo() {
		System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		System.out.println("������ �Է��� �ּ��� : ");
		String major = sc.nextLine();
		System.out.println("�г��� �Է��� �ּ���: ");
		int years = sc.nextInt(); sc.nextLine();
		info[count]= new PhoneUnivInfo(name,phoneNumber,major,years);
		System.out.println("�Էµ� ���� ���...");
		info[count++].showInfo();
		System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
		re = false;
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
		if(idx == NOT_FOUND) {// ������ //
			System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
			return;
		}
		else {
			for(int midx = idx;midx<count - 1;midx++)
				info[midx] = info[midx + 1];
		}
		System.out.println("\n������ ������ �Ϸ� �Ǿ����ϴ�");
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
		if(idx == NOT_FOUND) {// ������ //
			System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
			return;	
		}
		else
			info[idx].showInfo();
		System.out.println("������ �˻��� �Ϸ� �Ǿ����ϴ�.");
	}
	public void showAllinfo() {
		if(count == 0) {
			System.out.println("��ü ����� �����Ͱ� �����ϴ�...");
			return;
		}
		for(int i = 0;i<count;i++)
			info[i].showInfo();
	}
}
class PhoneInfo {
	private String name;
	private String phoneNumber;
	
	PhoneInfo(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber =phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void showInfo() {
			System.out.print("�̸� : "+name+" \t�ڵ��� ��ȣ : "+phoneNumber+"\t");
	}
}
class PhoneUnivInfo extends PhoneInfo{
	String major;
	int year;
	PhoneUnivInfo(String name, String phoneNumber,String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("�г� : "+year+"\t���� : "+major);
	}	
}
class PhoneComInfo extends PhoneInfo{
	String companyName;
	PhoneComInfo(String name, String phoneNumber, String companyName) {
		super(name, phoneNumber);
		this.companyName = companyName;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("ȸ���̸� : "+companyName);
	}	
	
}