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
			System.out.println("선택하세요...\n1. 데이터 입력 \n2. 데이터 검색\n3. 데이터 삭제\n4. 데이터 전체출력\n5. 프로그램 종료 ");
		else
			System.out.println("다시 선택하세요...\n1. 데이터 입력 \n2. 데이터 검색\n3. 데이터 삭제\n4. 데이터 전체출력\n5. 프로그램 종료");
	}
	public void showSubMenu(boolean re) {
		if(!re)
			System.out.println("1. 일반\t2. 대학\t3. 회사");
		else
			System.out.println("다시입력하세요...\t1. 일반\t2. 대학\t3. 회사");
	}
	public void readData() {
		if(count == 100){
			System.out.println("더 이상 데이터를 추가 할 수 없습니다 !");
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
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		info[count]= new PhoneInfo(name,phoneNumber);
		System.out.println("입력된 정보 출력...");
		info[count++].showInfo();
		System.out.println("데이터 입력이 완료 되었습니다.");
		re = false;
	}
	public void readCompanyPhoneInfo() {
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("회사이름을 입력해 주세요 : ");
		String companyName = sc.nextLine();
		info[count]= new PhoneComInfo(name,phoneNumber,companyName);
		System.out.println("입력된 정보 출력...");
		info[count++].showInfo();
		System.out.println("데이터 입력이 완료 되었습니다.");
		re = false;
	}
	public void readUnivPhoneInfo() {
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("전공을 입력해 주세요 : ");
		String major = sc.nextLine();
		System.out.println("학년을 입력해 주세요: ");
		int years = sc.nextInt(); sc.nextLine();
		info[count]= new PhoneUnivInfo(name,phoneNumber,major,years);
		System.out.println("입력된 정보 출력...");
		info[count++].showInfo();
		System.out.println("데이터 입력이 완료 되었습니다.");
		re = false;
	}
	public void removePhoneInfo() {
		if(count == 0) {
			System.out.println("삭제할 데이터가 없습니다");
			return;
		}
		System.out.println("데이터 검색을 시작합니다...");
		System.out.println("이름 :");
		String removeName = sc.nextLine();
		int idx = search(removeName);
		if(idx == NOT_FOUND) {// 없으면 //
			System.out.println("해당 이름을 가진 사람이 없습니다 !");
			return;
		}
		else {
			for(int midx = idx;midx<count - 1;midx++)
				info[midx] = info[midx + 1];
		}
		System.out.println("\n데이터 삭제가 완료 되었습니다");
		count--;
		
	}
	public void searchShowInfo() {
		if(count == 0) {
			System.out.println("찾을 데이터가 없습니다");
			return;
		}
		System.out.println("데이터 검색을 시작합니다...");
		System.out.println("이름 :");
		String searchName = sc.nextLine();
		int idx = search(searchName);
		if(idx == NOT_FOUND) {// 없으면 //
			System.out.println("해당 이름을 가진 사람이 없습니다 !");
			return;	
		}
		else
			info[idx].showInfo();
		System.out.println("데이터 검색이 완료 되었습니다.");
	}
	public void showAllinfo() {
		if(count == 0) {
			System.out.println("전체 출력할 데이터가 없습니다...");
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
			System.out.print("이름 : "+name+" \t핸드폰 번호 : "+phoneNumber+"\t");
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
		System.out.println("학년 : "+year+"\t전공 : "+major);
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
		System.out.println("회사이름 : "+companyName);
	}	
	
}