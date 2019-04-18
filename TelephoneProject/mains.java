package TelephoneProject;

import java.util.Scanner;

public class mains{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager(); 
		int choice;
		boolean reEnter = false;
		while(true) {
			manager.showMenu(reEnter);
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				manager.readData();
				break;
			case 2:
				if(manager.getCount() == 0) {
					System.out.println("찾을 데이터가 없습니다");
					break;
				}
				System.out.println("데이터 검색을 시작합니다...");
				System.out.println("이름 :");
				String searchName = sc.nextLine();
				manager.searchShowInfo(searchName);
				break;
			case 3:
				if(manager.getCount() == 0) {
					System.out.println("삭제할 데이터가 없습니다");
					break;
				}
				System.out.println("데이터 검색을 시작합니다...");
				System.out.println("이름 :");
				String removeName = sc.nextLine();
				manager.removePhoneInfo(removeName);
				break;
			case 4:
				return;
			default:
				reEnter = true;
				continue;	
			}
			reEnter = false;
		}	
	}
}