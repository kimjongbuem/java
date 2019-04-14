package CH32_IO_Stream;
import java.io.*;
public class Yoon32_2_2 {

	public static void main(String[] args) {
		// 버퍼링 기능을 제공하는 필터스트림 //
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("data.txt"));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("copy.txt"))	
				){
			int data;
			while(true) {
				data = in.read();
				if(data == -1)
					break;
				out.write(data);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
