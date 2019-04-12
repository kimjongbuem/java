package CH28;

import java.util.Optional;

public class Yoon28_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContInfo ci = new ContInfo("321-123-456","Repulbic of Korea");
		Company cp = new Company("Yohan Co.",ci);
		Friend frn = new Friend("lee chan", cp);
		showCompAddr(Optional.of(frn));
	}
	public static void showCompAddr(Optional<Friend> F) {
		String addr = F.map(Friend::getCmp).
						map(Company::getCInfo).
						map(ContInfo::getAdrs).
						orElse("There is no Address");
		String cName = F.map(Friend::getCmp).
						 map(c -> c.getCName()).
						 orElse("not Company");
		System.out.println(cName);
		System.out.println(addr);
	}
	
}

class ContInfo{
	String phone;
	String adrs;
	public ContInfo(String p, String adr) {
		phone = p; adrs = adr;
	}
	public String getPhone() {return phone;}
	public String getAdrs() {return adrs;}
	
	
}
class Company{
	String cName;
	ContInfo cInfo;
	
	public Company(String cn, ContInfo ci) {
		cName = cn;
		cInfo = ci;
	}
	public String getCName() {return cName;}
	public ContInfo getCInfo() {return cInfo;}
}

class Friend{ // 클래스 정의시 null이 안들어가게 정의하자.
	String name;
	Company cmp;
	public Friend(String n, Company c) {
		name = n; cmp = c;
	}
	public String getName() {return name;}
	public Company getCmp() {return cmp;}
	
//	public static void showCompAddr(Friend F) { 복잡허 죽것다~`~
//		String addr = null;
//		if( F!= null)
//			Company com = F.getCmp();
//		
//			if(com != null)
//				ContInfo info = com.getCInfo();
//			
//				if(info!=null)
//					addr = info.getAdrs();
//				
//				if(addr != null)
//					System.out.println(addr);
//				else
//					System.out.println("There is no address information");
//		
//	}
	
}