package NetWorkandDB;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
public class URLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	InputStream is = null; InputStreamReader isr = null; BufferedReader br = null;
//		
//		try {
//			URL url = new URL("Http://www.hyejiwon.co.kr"); // url��ü����
//			is = url.openStream();// �ش� url���� �����͸� �о���ϼ� �ִ�  InputStream�� ������ �κ���.
//			isr = new InputStreamReader(is,"UTF-8"); // �ش�κ��� utf - 8 �ڵ�� ������.
//			br = new BufferedReader(isr);// ���پ��б�����.. �ӵ���...
//			
//			String str="";
//			while((str = br.readLine())!=null) {
//				System.out.println(str);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				is.close();
//				isr.close();
//				br.close();
//			}catch(Exception e) {
//			}
//		}
//		URL url = new URL("Http://www.hyejiwon.co.kr"); // url��ü����
		URL url = null;
		try {
			url = new URL("Http://www.hyejiwon.co.kr");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try(InputStream iss = url.openStream(); InputStreamReader isrs = new InputStreamReader(iss,"UTF-8"); BufferedReader brs = new BufferedReader(isrs);){
			String str="";
			while((str = brs.readLine())!=null) {
				System.out.println(str);
			}}catch(Exception e) {
		}
		
	}
}
