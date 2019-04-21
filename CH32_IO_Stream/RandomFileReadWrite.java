package CH32_IO_Stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileReadWrite {

	public static void main(String[] args)  {
		try(RandomAccessFile raf = new RandomAccessFile("data5.txt","rw")){
			System.out.println("Write..............");
			System.out.printf("현 입출력 위치 : %d바이트\n", raf.getFilePointer());
			raf.writeInt(200); raf.writeInt(400);
			System.out.printf("현 입출력 위치 : %d바이트\n", raf.getFilePointer());
			raf.writeDouble(50.12);
			raf.writeDouble(78.99);
			System.out.printf("현 입출력 위치 : %d바이트\n", raf.getFilePointer());
			System.out.println("Read...............");
			raf.seek(0); //맨앞이동
			System.out.printf("현 입출력 위치 : %d바이트\n", raf.getFilePointer());
			System.out.println(raf.readInt());
			System.out.println(raf.readInt());
			System.out.printf("현 입출력 위치 : %d바이트\n", raf.getFilePointer());
			System.out.println(raf.readDouble());
			System.out.println(raf.readDouble());
			System.out.printf("현 입출력 위치 : %d바이트\n", raf.getFilePointer());
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
