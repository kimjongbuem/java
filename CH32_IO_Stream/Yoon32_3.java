package CH32_IO_Stream;
import java.io.*;
public class Yoon32_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Writer out = new FileWriter("data2.txt")){
			for(int ch = (int)'A'; ch < (int)('Z' + 1); ch++) {
				out.write(ch);
			}
			}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try(Reader out = new FileReader("data.txt")){
			int ch;
			while(true) {
				ch = out.read();
				if(ch == -1)
					break;
				System.out.print((char)ch);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println();
		
		String ks = "공부는 힘들다";
		String es = "Studying is hard";
		try(BufferedWriter out = new BufferedWriter(new FileWriter("data3.txt"))){
			out.write(ks);
			out.newLine();
			out.write(es);
			}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try(BufferedReader out = new BufferedReader(new FileReader("data3.txt"))){
			
			while(true) {
				String str = out.readLine(); // 개행기준으로 앞뒤로 문자열을 읽어들인다.
				if(str == null)
					break;
				System.out.println(str);
			}
			}
		catch(Exception e){
			e.printStackTrace();
		}
		try(BufferedWriter ws = new BufferedWriter(new FileWriter("data4.txt"))){
			ws.write("Hello World");
			ws.newLine();
			ws.write("KimJongbuem");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try(BufferedReader ws = new BufferedReader(new FileReader("data4.txt"))){String str;
			str = ws.readLine();
			System.out.println(str);
			str = ws.readLine();
			System.out.println(str);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
