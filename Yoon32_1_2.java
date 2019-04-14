package CH32_IO_Stream;
import java.io.*;
public class Yoon32_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int EOF = -1;
		try(InputStream in = new FileInputStream("data.txt"); OutputStream out = new FileOutputStream("copy.txt")){
//			int data;
//			while(true) {
//				data = in.read();
//				if(data == EOF) // 파일의 끝 반환
//					break;
//				out.write(data);
//			}
			byte buf[] = new byte[1024]; //버퍼 생성 ㅋ
			int len;
			
			while(true) {
				len = in.read(buf);
				if(len == -1)
					break;
				out.write(buf,0, len); // len 바이트만큼 저장
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("END");
	}

}
