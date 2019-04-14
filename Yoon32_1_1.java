package CH32_IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Yoon32_1_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		OutputStream out = new FileOutputStream("data.txt");
		out.write(5);
		out.close();
		FileInputStream in = new FileInputStream("data.dat");
		int dat = in.read();
		in.close();
		System.out.println(dat);
	}

}
