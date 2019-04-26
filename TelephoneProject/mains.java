package TelephoneProject;

import java.util.Scanner;

public class mains{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		PhoneBookGUI_Manager GUI_Manager = new PhoneBookGUI_Manager();
		int choice;
		while(true) {
			try {
			manager.showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			if(SELECT_MENU.EXIT < choice || SELECT_MENU.INPUT > choice)
				throw new ChoiceNumberException(choice);
			switch(choice) {
			case SELECT_MENU.INPUT:
				manager.readData();
				break;
			case SELECT_MENU.ALL_OUTPUT:
				manager.showAllinfo();
				break;
			case SELECT_MENU.EXIT:
				manager.storePhoneInfo();
				return;
			default:
				continue;	
			}
			}catch(ChoiceNumberException e) {
				e.showExceptionMessage();
			}
		}	
	}
}