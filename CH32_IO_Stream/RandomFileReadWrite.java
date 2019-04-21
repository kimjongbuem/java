package CH32_IO_Stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileReadWrite {

	public static void main(String[] args)  {
		try(RandomAccessFile raf = new RandomAccessFile("data5.txt","rw")){
			System.out.println("Write..............");
			System.out.printf("�� ����� ��ġ : %d����Ʈ\n", raf.getFilePointer());
			raf.writeInt(200); raf.writeInt(400);
			System.out.printf("�� ����� ��ġ : %d����Ʈ\n", raf.getFilePointer());
			raf.writeDouble(50.12);
			raf.writeDouble(78.99);
			System.out.printf("�� ����� ��ġ : %d����Ʈ\n", raf.getFilePointer());
			System.out.println("Read...............");
			raf.seek(0); //�Ǿ��̵�
			System.out.printf("�� ����� ��ġ : %d����Ʈ\n", raf.getFilePointer());
			System.out.println(raf.readInt());
			System.out.println(raf.readInt());
			System.out.printf("�� ����� ��ġ : %d����Ʈ\n", raf.getFilePointer());
			System.out.println(raf.readDouble());
			System.out.println(raf.readDouble());
			System.out.printf("�� ����� ��ġ : %d����Ʈ\n", raf.getFilePointer());
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
