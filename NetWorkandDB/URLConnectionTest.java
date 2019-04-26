package NetWorkandDB;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class URLConnectionTest {

	public static void main(String[] args) {
		URL url = null;
		URLConnection con = null; // 통신링크 //
		try {
			url = new URL("Http://www.hyejiwon.co.kr");
			con = url.openConnection();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e) {
		}
		
		try(InputStream iss = con.getInputStream();InputStreamReader isrs = new InputStreamReader(iss,"UTF-8"); BufferedReader brs = new BufferedReader(isrs);){
			String str="";
			String contentType = con.getContentType();
			System.out.println(contentType);
			while((str = brs.readLine())!=null) {
				System.out.println(str);
			}}catch(Exception e) {
		}

	}

}
