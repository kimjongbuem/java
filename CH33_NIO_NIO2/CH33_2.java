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
				)){ // ���ͽ�Ʈ���� ����Ǿ� �ִ� ��½�Ʈ���� �ڵ����� ������ ����
					dOut.writeInt(370);
					dOut.writeDouble(3.1545);
				}
				catch(Exception e) {
					e.printStackTrace();
		}
		try(DataOutputStream dOut = new DataOutputStream(Files.newOutputStream(fp))) { // ����Ʈ ��Ʈ�� �ڵ尣��ȭ ���� //
			dOut.writeInt(370);
			dOut.writeDouble(3.1545);
		}
		catch(Exception e) {
				e.printStackTrace();
				}
		String ks = "���ο� �־";
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
				String str = out.readLine(); // ����������� �յڷ� ���ڿ��� �о���δ�.
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
