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
			System.out.println("선택하세요...\n1. 데이터 입력 \n2. 데이터 검색\n3. 데이터 삭제\n4. 프로그램 종료 ");
		else
			System.out.println("다시 선택하세요...\n1. 데이터 입력 \\n2. 데이터 검색\\n3. 데이터 삭제\\n4. 프로그램 종료 ");
	}
	public void readData() {
		if(count == 100){
			System.out.println("더 이상 데이터를 추가 할 수 없습니다 !");
			return;
		}
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
		info[count++] = p;
		System.out.println("데이터 입력이 완료 되었습니다.");
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
		if(idx == -1) {// 없으면 //
			System.out.println("해당 이름을 가진 사람이 없습니다 !");
			return;
		}
		else {
			for(int midx = idx;midx<count - 1;midx++)
				info[midx] = info[midx + 1];
		}
		System.out.println("데이터 삭제가 완료 되었습니다");
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
		if(idx == -1) {// 없으면 //
			System.out.println("해당 이름을 가진 사람이 없습니다 !");
			return;	
		}
		else
			info[idx].showTelephoneInfo();
		System.out.println("데이터 검색이 완료 되었습니다.");
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
			System.out.println("이름 : "+name+" 핸드폰 번호 : "+phoneNumber+" 생일: "+birthday);
		else
			System.out.println("이름 : "+name+" 핸드폰 번호 : "+phoneNumber);
	}
}