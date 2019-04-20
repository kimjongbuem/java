package TelephoneProject;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

interface SELECT_MENU{
	int INPUT = 1, SEARCH = 2, DELETE = 3, ALL_OUTPUT = 4, EXIT= 5;
}
interface SELECT_INPUT{
	int NORMAL = 1, UNIV = 2, COMPANY = 3; 
}
public class PhoneBookManager {
	static Scanner sc = new Scanner(System.in);
	private int count = 0;
	HashSet<PhoneInfo> info;
	PhoneBookManager(){
		info = new HashSet<>();
	}
	private PhoneInfo search(String name) {
		for(Iterator<PhoneInfo> i = info.iterator(); i.hasNext() ;){
			PhoneInfo foundedPhoneInfo = i.next();
			if(foundedPhoneInfo.getName().equals(name)){
				return foundedPhoneInfo;
			}
		}
		return null;
	}
	public void showMenu() {
			System.out.println("선택하세요...\n1. 데이터 입력 \n2. 데이터 검색\n3. 데이터 삭제\n4. 데이터 전체출력\n5. 프로그램 종료 ");
	}
	public void showSubMenu() {
			System.out.println("1. 일반\t2. 대학\t3. 회사");
			System.out.println("선택>>");
	}
	public void readData() {
		try {
		while(true) {
			int choice;
			PhoneInfo tmp = null;
			showSubMenu();
			choice = sc.nextInt();
			sc.nextLine();
			if(SELECT_INPUT.COMPANY < choice || SELECT_INPUT.NORMAL > choice)
				throw new ChoiceNumberException(choice);
			switch(choice) {
			case SELECT_INPUT.NORMAL:
				tmp = readNormalPhoneInfo();
				break;
			case SELECT_INPUT.UNIV:
				tmp = readUnivPhoneInfo();
				break;
			case SELECT_INPUT.COMPANY:
				tmp = readCompanyPhoneInfo();
				break;
			}
			boolean check = info.add(tmp);
			if(check) {
				count++;
				System.out.println("데이터가 입력 되었습니다..."); 		return;
			}else return;
		}
		}catch(ChoiceNumberException e) {
			e.showExceptionMessage();
		}
	}
	public PhoneInfo readNormalPhoneInfo() {
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		return new PhoneInfo(name,phoneNumber);

	}
	public PhoneInfo readCompanyPhoneInfo() {
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("회사이름을 입력해 주세요 : ");
		String companyName = sc.nextLine();
		return new PhoneComInfo(name,phoneNumber,companyName);
	
	}
	public PhoneInfo readUnivPhoneInfo() {
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("전공을 입력해 주세요 : ");
		String major = sc.nextLine();
		System.out.println("학년을 입력해 주세요: ");
		int years = sc.nextInt(); sc.nextLine();
		return new PhoneUnivInfo(name,phoneNumber,major,years);
		
	}
	public void removePhoneInfo() {
		if(count == 0) {
			System.out.println("삭제할 데이터가 없습니다");
			return;
		}
		System.out.println("데이터 검색을 시작합니다...");
		System.out.println("이름 :");
		String removeName = sc.nextLine();
		PhoneInfo tempInfo = search(removeName);
		if(tempInfo == null) {// 없으면 //
			System.out.println("해당 이름을 가진 사람이 없습니다 !");
			return;
		}
		else {
			for(Iterator<PhoneInfo> i=info.iterator();i.hasNext();) {
				if(i.next()==tempInfo) {
					i.remove();
					System.out.println("데이터 삭제가 완료 되었습니다");
					count--;
					return;
				}
			}
		}
	}
	public void searchShowInfo() {
		if(count == 0) {
			System.out.println("찾을 데이터가 없습니다");
			return;
		}
		System.out.println("데이터 검색을 시작합니다...");
		System.out.println("이름 :");
		String searchName = sc.nextLine();
		PhoneInfo tempInfo= search(searchName);
		if(tempInfo == null) {// 없으면 //
			System.out.println("해당 이름을 가진 사람이 없습니다 !");
			return;	
		}
		else
			tempInfo.showInfo();
		System.out.println("데이터 검색이 완료 되었습니다.");
	}
	public void showAllinfo() {
		if(count == 0) {
			System.out.println("전체 출력할 데이터가 없습니다...");
			return;
		}
		for(Iterator<PhoneInfo> i = info.iterator(); i.hasNext();) {
				i.next().showInfo();
				System.out.println();
		}
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
	public int hashCode() {
		return name.hashCode() + phoneNumber.hashCode();
	}
	public boolean equals(Object obj) {
		PhoneInfo compares = (PhoneInfo)obj;
		if(name.equals(compares.name))
		{
			System.out.println("이미 저장된 데이터입니다!");
			return true;
		}
			return false;
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
		System.out.print("회사이름 : "+companyName);
	}	
	
}