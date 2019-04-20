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
			System.out.println("�����ϼ���...\n1. ������ �Է� \n2. ������ �˻�\n3. ������ ����\n4. ������ ��ü���\n5. ���α׷� ���� ");
	}
	public void showSubMenu() {
			System.out.println("1. �Ϲ�\t2. ����\t3. ȸ��");
			System.out.println("����>>");
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
				System.out.println("�����Ͱ� �Է� �Ǿ����ϴ�..."); 		return;
			}else return;
		}
		}catch(ChoiceNumberException e) {
			e.showExceptionMessage();
		}
	}
	public PhoneInfo readNormalPhoneInfo() {
		System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		return new PhoneInfo(name,phoneNumber);

	}
	public PhoneInfo readCompanyPhoneInfo() {
		System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		System.out.println("ȸ���̸��� �Է��� �ּ��� : ");
		String companyName = sc.nextLine();
		return new PhoneComInfo(name,phoneNumber,companyName);
	
	}
	public PhoneInfo readUnivPhoneInfo() {
		System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		System.out.println("������ �Է��� �ּ��� : ");
		String major = sc.nextLine();
		System.out.println("�г��� �Է��� �ּ���: ");
		int years = sc.nextInt(); sc.nextLine();
		return new PhoneUnivInfo(name,phoneNumber,major,years);
		
	}
	public void removePhoneInfo() {
		if(count == 0) {
			System.out.println("������ �����Ͱ� �����ϴ�");
			return;
		}
		System.out.println("������ �˻��� �����մϴ�...");
		System.out.println("�̸� :");
		String removeName = sc.nextLine();
		PhoneInfo tempInfo = search(removeName);
		if(tempInfo == null) {// ������ //
			System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
			return;
		}
		else {
			for(Iterator<PhoneInfo> i=info.iterator();i.hasNext();) {
				if(i.next()==tempInfo) {
					i.remove();
					System.out.println("������ ������ �Ϸ� �Ǿ����ϴ�");
					count--;
					return;
				}
			}
		}
	}
	public void searchShowInfo() {
		if(count == 0) {
			System.out.println("ã�� �����Ͱ� �����ϴ�");
			return;
		}
		System.out.println("������ �˻��� �����մϴ�...");
		System.out.println("�̸� :");
		String searchName = sc.nextLine();
		PhoneInfo tempInfo= search(searchName);
		if(tempInfo == null) {// ������ //
			System.out.println("�ش� �̸��� ���� ����� �����ϴ� !");
			return;	
		}
		else
			tempInfo.showInfo();
		System.out.println("������ �˻��� �Ϸ� �Ǿ����ϴ�.");
	}
	public void showAllinfo() {
		if(count == 0) {
			System.out.println("��ü ����� �����Ͱ� �����ϴ�...");
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
			System.out.print("�̸� : "+name+" \t�ڵ��� ��ȣ : "+phoneNumber+"\t");
	}
	public int hashCode() {
		return name.hashCode() + phoneNumber.hashCode();
	}
	public boolean equals(Object obj) {
		PhoneInfo compares = (PhoneInfo)obj;
		if(name.equals(compares.name))
		{
			System.out.println("�̹� ����� �������Դϴ�!");
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
		System.out.println("�г� : "+year+"\t���� : "+major);
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
		System.out.print("ȸ���̸� : "+companyName);
	}	
	
}