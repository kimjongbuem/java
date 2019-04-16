package TelephoneProject;

public class PhoneInfo {
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
class mains{
	public static void main(String[] args) {
		PhoneInfo p1 = new PhoneInfo("김은정","010-2254-6556","980325");
		PhoneInfo p2 = new PhoneInfo("김찬후","010-1111-1556");
		p1.showTelephoneInfo();
		p2.showTelephoneInfo();
	}
}