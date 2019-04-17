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
			System.out.println("이름 : "+name+" 핸드폰 번호 : "+phoneNumber+" 생일: "+birthday);
		else
			System.out.println("이름 : "+name+" 핸드폰 번호 : "+phoneNumber);
	}
}
class mains{
	static Scanner sc = new Scanner(System.in);
	public static void showMenu(boolean re) {
		if(!re)
			System.out.println("선택하세요...\n1. 데이터 입력 \n2. 프로그램 종료 ");
		else
			System.out.println("다시 선택하세요...\n1. 데이터 입력 \n2. 프로그램 종료 ");
			
	}
	public static void readData() {
		
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("생일을 입력해 주세요 : ");
		String birthday = sc.nextLine();
		PhoneInfo p;
		if(birthday == null)
			p = new PhoneInfo(name,phoneNumber);
		else
			p = new PhoneInfo(name,phoneNumber,birthday);
		System.out.println("입력된 정보 출력...");
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