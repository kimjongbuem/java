package TelephoneProject;

import java.util.Scanner;

public class PhoneInfo {
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
class mains{
	static Scanner sc = new Scanner(System.in);
	public static void showMenu(boolean re) {
		if(!re)
			System.out.println("�����ϼ���...\n1. ������ �Է� \n2. ���α׷� ���� ");
		else
			System.out.println("�ٽ� �����ϼ���...\n1. ������ �Է� \n2. ���α׷� ���� ");
			
	}
	public static void readData() {
		
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
		}
	public static void main(String[] args) {
		int choice;
		boolean reEnter = false;
		while(true) {
			showMenu(reEnter);
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				readData();
				break;
			case 2:
				return;
			default:
				reEnter = true;
				continue;	
			}
			reEnter = false;
		}	
	}
}