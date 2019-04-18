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
					System.out.println("ã�� �����Ͱ� �����ϴ�");
					break;
				}
				System.out.println("������ �˻��� �����մϴ�...");
				System.out.println("�̸� :");
				String searchName = sc.nextLine();
				manager.searchShowInfo(searchName);
				break;
			case 3:
				if(manager.getCount() == 0) {
					System.out.println("������ �����Ͱ� �����ϴ�");
					break;
				}
				System.out.println("������ �˻��� �����մϴ�...");
				System.out.println("�̸� :");
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