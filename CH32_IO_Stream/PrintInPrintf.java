package CH32_IO_Stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class PrintInPrintf {

	public static void main(String[] args) {
		MyInfo mInfo = new MyInfo("���� �ڹ� ���α׷��� �Դϴ�!");
		System.out.println("�� �Ұ��� �ϰڽ��ϴ�");
		System.out.println(mInfo);
		System.out.printf("���� %d, ������ %dkg�Դϴ�.",24,72);
		
		try(PrintStream p = new PrintStream(new FileOutputStream("test.txt"))){
			p.print(24);
			p.println("�� �Ұ��� �ϰڽ��ϴ�");
			p.println(mInfo);
			p.printf("���� %d, ������ %dkg�Դϴ�.",24,72);
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