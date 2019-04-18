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
				manager.searchShowInfo();
				break;
			case 3:
				manager.removePhoneInfo();
				break;
			case 4:
				manager.showAllinfo();
				break;
			case 5:
				return;
			default:
				reEnter = true;
				continue;	
			}
			reEnter = false;
		}	
	}
}