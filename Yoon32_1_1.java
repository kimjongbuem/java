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
		 * ��Ʈ�� ok -> close
		 * ��Ʈ�� no -> Do not close
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
			if(stableOut != null) // ��½�Ʈ�� �����ߴٸ�
				stableOut.close();
		}
		
		try {
			in = new FileInputStream("data.txt");
			int data = in.read();
			System.out.println(data);
		}
		finally {
			if(in != null) // ��½�Ʈ�� �����ߴٸ�
				in.close();
		}
		
		// try with resource//
		try(OutputStream outs = new FileOutputStream("data.txt")){
			outs.write(0xff);
		}
		catch(IOException e) { //���ο� ���̿� �Լ��� �ȴ����� �� �˾Ƽ� ���ش�. close�� ���ϼ� �Ű�Ⱦ�
			e.printStackTrace();
		}
	}

}
