package CH33_NIO_NIO2;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CH33_3_2 {

	public static void main(String[] args) {
		/*
		 * ���� ��� ����Ʈ???
		 * I/O Stream �ӵ� �ذ���� ä�ΰ� ����(allocate)
		 */
		
		// ���� ���� ���� <- �б������� ����. //
		ByteBuffer buf = ByteBuffer.allocate(1024); // ���ۻ��� allocateDirect 
		Path ph = Paths.get("data.txt");
		buf.putInt(120); buf.putInt(200);
		buf.putDouble(0.94); buf.putDouble(1.22);
		
		try(FileChannel fc = FileChannel.open(ph, StandardOpenOption.CREATE,StandardOpenOption.READ,
				StandardOpenOption.WRITE)){
			buf.flip();
			fc.write(buf);
			buf.clear();
			buf.position(0);
			fc.position(0);
			fc.read(buf); //��°�� ���Ͽ� �ִ°͵� ��� ���ۿ� ó����  WRITE��� 
			buf.flip(); // read���
			System.out.println(buf.getInt());
			buf.position(Integer.BYTES*2);
			System.out.println(buf.getDouble()); System.out.println(buf.getDouble());
			buf.position(Integer.BYTES);
			System.out.println(buf.getInt());
			}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
