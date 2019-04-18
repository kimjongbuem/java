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
			case SELECT_MENU.INPUT:
				manager.readData();
				break;
			case SELECT_MENU.SEARCH:
				manager.searchShowInfo();
				break;
			case SELECT_MENU.DELETE:
				manager.removePhoneInfo();
				break;
			case SELECT_MENU.ALL_OUTPUT:
				manager.showAllinfo();
				break;
			case SELECT_MENU.EXIT:
				return;
			default:
				reEnter = true;
				continue;	
			}
			reEnter = false;
		}	
	}
}