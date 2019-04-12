package CH28;

public class Yoon28_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void showCompAddr(Friend F) {
		String addr = null;
		if( F!= null)
			Company com = F.getCmp();
		
			if(com != null)
				ContInfo info = com.getCInfo();
			
				if(info!=null)
					addr = info.getAdrs();
				
				if(addr != null)
					System.out.println(addr);
				else
					System.out.println("There is no address information");
		
	}
}
class Friend{ // 클래스 정의시 null이 안들어가게 정의하자.
	String name;
	Company cmp;
	public Friend(String n, Company c) {
		name = n; cmp = c;
	}
	public String getName() {return name;}
	public Company getCmp() {return cmp;}
	
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

class ContInfo{
	String phone;
	String adrs;
	public ContInfo(String p, String adr) {
		phone = p; adrs = adr;
	}
	public String getPhone() {return phone;}
	public String getAdrs() {return adrs;}
}