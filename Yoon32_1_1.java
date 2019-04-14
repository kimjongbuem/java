package CH32_IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Yoon32_1_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		OutputStream out = new FileOutputStream("data.txt");
		/*
		 * 스트림 ok -> close
		 * 스트림 no -> Do not close
		 */
		out.write(5);
		out.close();
		FileInputStream in = new FileInputStream("data.dat");
		int dat = in.read();
		in.close();
		System.out.println(dat);
		
		OutputStream stableOut = null;
		try {
			stableOut = new FileOutputStream("data.txt");
			stableOut.write(120);
		}
		finally {
			if(stableOut != null) // 출력스트림 생성했다면
				stableOut.close();
		}
		
		try {
			in = new FileInputStream("data.txt");
			int data = in.read();
			System.out.println(data);
		}
		finally {
			if(in != null) // 출력스트림 생성했다면
				in.close();
		}
		
		// try with resource//
		try(OutputStream outs = new FileOutputStream("data.txt")){
			outs.write(0xff);
		}
		catch(IOException e) { //메인에 아이오 입셉션 안던져도 됨 알아서 해준다. close에 대하서 신경안씀
			e.printStackTrace();
		}
	}

}
