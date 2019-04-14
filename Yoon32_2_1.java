package CH32_IO_Stream;
import java.io.*;
public class Yoon32_2_1 {

	public static void main(String[] args) {
		// 필터 스트림 //
		// 추가적 기능 덧붙임// 
		// File 1byte --> 복사는 걍 버퍼 쓰면되지만, 정수, 문자, 실수 같은 거 저장하면 1바이트씩 못해 ㅠㅠ //
		// java는 4바이트 정수를 각각 바이트단위로 쪼개서(기능이 없음) 일반적으로 저장안해줘 
		// 정수형 : 1바이트 4개 갖고와서 4바이트 int로 조합
		// how to link filter Stream?
		try(DataOutputStream dOut = new DataOutputStream(new FileOutputStream("data.txt")
		)){ // 필터스트림과 연결되어 있는 출력스트림은 자동으로 닫혀요 ㅎㅎ
			dOut.writeInt(370);
			dOut.writeDouble(3.1545);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		try(DataInputStream dIn = new DataInputStream(new FileInputStream("data.txt")
				)){ // 필터스트림과 연결되어 있는 출력스트림은 자동으로 닫혀요 ㅎㅎ
					int num1 = dIn.readInt();
					double num2 = dIn.readDouble();
					System.out.println(num1);
					System.out.println(num2);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
	}

}
