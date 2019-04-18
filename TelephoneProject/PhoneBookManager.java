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
	}
	public void removePhoneInfo(String name) {
		for(int i =0; i<count;i++){
			if(info[i].getName().equals(name)){
				for(int j = i;j<count;j++)
					info[j] = info[j+1];
				count--;
				return;
			}
		}// 없으면 //
		System.out.println("해당 이름을 가진 사람이 없습니다 !");
	}
	public void searchShowInfo(String name) {
		for(int i =0; i<count;i++){
			if(info[i].getName().equals(name)){
				info[i].showTelephoneInfo();
				return;
			}
		}// 없으면 //
		System.out.println("해당 이름을 가진 사람이 없습니다 !");
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