package NetWorkandDB;
import java.net.*;
public class INetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ia = null; // 특정 IP주소를 다루기 위한 클래스임!
		try{
			ia = InetAddress.getLocalHost();
			System.out.println(ia);
			
			ia = InetAddress.getByName("www.naver.com");
			System.out.println(ia);
			
			InetAddress[] ala = InetAddress.getAllByName("http://www.google.com");
			
			for(int i=1;i<ala.length;i++)
				System.out.println(ala[i]);
		}catch(Exception e) {}
	}

}
