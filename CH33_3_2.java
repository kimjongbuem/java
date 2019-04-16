package CH33_NIO_NIO2;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CH33_3_2 {

	public static void main(String[] args) {
		/*
		 * 성능 향상 포인트???
		 * I/O Stream 속도 해결모델인 채널과 버퍼(allocate)
		 */
		
		// 파일 랜덤 접근 <- 읽기측면이 강함. //
		ByteBuffer buf = ByteBuffer.allocate(1024); // 버퍼생성 allocateDirect 
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
			fc.read(buf); //통째로 파일에 있는것들 모두 버퍼에 처넣음  WRITE모드 
			buf.flip(); // read모드
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
