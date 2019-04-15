package CH33_NIO_NIO2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
public class CH33_1_3 {

	public static void main(String[] args) throws IOException {
		// 조금 무거운 IO 스트림 //
		
/*		try(BufferedWriter ws = new BufferedWriter(new FileWriter("data4.txt"))){
			ws.write("Hello World");
			ws.newLine();
			ws.write("KimJongbuem");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try(BufferedReader ws = new BufferedReader(new FileReader("data4.txt"))){String str;
			str = ws.readLine();
			System.out.println(str);
			str = ws.readLine();
			System.out.println(str);
		}
		catch(Exception e) {
			e.printStackTrace();
	}*/
		
		// 파일을 대상으로 하는 간단한 입출력 오픈 크로즈를 코드레벨에서 생략함 ㅎㅎ <-버퍼링 불가능 // 
		Path sp = Paths.get("C:\\javaStudy\\simple.txt");
		String s1 = "One Simple String";
		String s2 = "Two Simple String";
		List<String> li = Arrays.asList(s1,s2); //컬렉션 인스턴스 ㅇㅇ
		Files.write(sp, li);
		List<String> li2 = Files.readAllLines(sp);
		System.out.println(li2);
		Path fp = Paths.get("C:\\javaStudy\\empty.txt");
		fp = Files.createFile(fp); // 파일생성하는데 파일이 있으면 예외임
		byte buf1[] = {0x13,0x14,0x15};
		for(byte b : buf1)
			System.out.print(b+"\t");
		System.out.println();
		
		Files.write(fp,buf1,StandardOpenOption.APPEND); // 문자스트림, 독립된 문장이야 ~ 원래 오픈크로즈 해야되는데 안함 ^^
		
		byte buf2[] = Files.readAllBytes(fp);
		for(byte b : buf2)
			System.out.print(b+"\t");
		System.out.println();
	}
}
