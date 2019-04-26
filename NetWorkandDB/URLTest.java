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
//			URL url = new URL("Http://www.hyejiwon.co.kr"); // url객체생성
//			is = url.openStream();// 해당 url에서 데이터를 읽어들일수 있는  InputStream을 얻어오는 부분임.
//			isr = new InputStreamReader(is,"UTF-8"); // 해당부분을 utf - 8 코드로 가져옴.
//			br = new BufferedReader(isr);// 한줄씩읽기위함.. 속도도...
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
//		URL url = new URL("Http://www.hyejiwon.co.kr"); // url객체생성
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
