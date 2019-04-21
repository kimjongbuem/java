package CH32_IO_Stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class PrintInPrintf {

	public static void main(String[] args) {
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머 입니다!");
		System.out.println("제 소개를 하겠습니다");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.",24,72);
		
		try(PrintStream p = new PrintStream(new FileOutputStream("test.txt"))){
			p.print(24);
			p.println("제 소개를 하겠습니다");
			p.println(mInfo);
			p.printf("나이 %d, 몸무게 %dkg입니다.",24,72);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
class MyInfo{
	String info;
	public MyInfo(String info) {
		this.info = info;
	}
	public String toString() {
		return info;
	}
}