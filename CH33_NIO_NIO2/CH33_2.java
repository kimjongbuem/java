package CH33_NIO_NIO2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class CH33_2 {

	public static void main(String[] args)throws IOException{
		Path fp = Paths.get("data3.txt");
		try(DataOutputStream dOut = new DataOutputStream(new FileOutputStream("data.txt")
				)){ // 필터스트림과 연결되어 있는 출력스트림은 자동으로 닫혀요 ㅎㅎ
					dOut.writeInt(370);
					dOut.writeDouble(3.1545);
				}
				catch(Exception e) {
					e.printStackTrace();
		}
		try(DataOutputStream dOut = new DataOutputStream(Files.newOutputStream(fp))) { // 바이트 스트림 코드간결화 개선 //
			dOut.writeInt(370);
			dOut.writeDouble(3.1545);
		}
		catch(Exception e) {
				e.printStackTrace();
				}
		String ks = "공부에 있어서";
		String es = "Life is long if ..  .";
		Path p = Paths.get("data3.txt");
		try(BufferedWriter out = new BufferedWriter(Files.newBufferedWriter(fp))){
			out.write(ks);
			out.newLine();
			out.write(es);
			}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try(BufferedReader out = new BufferedReader(Files.newBufferedReader(fp))){
			
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
		
	}

}
