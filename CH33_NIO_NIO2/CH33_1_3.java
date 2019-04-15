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
		// ���� ���ſ� IO ��Ʈ�� //
		
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
		
		// ������ ������� �ϴ� ������ ����� ���� ũ��� �ڵ巹������ ������ ���� <-���۸� �Ұ��� // 
		Path sp = Paths.get("C:\\javaStudy\\simple.txt");
		String s1 = "One Simple String";
		String s2 = "Two Simple String";
		List<String> li = Arrays.asList(s1,s2); //�÷��� �ν��Ͻ� ����
		Files.write(sp, li);
		List<String> li2 = Files.readAllLines(sp);
		System.out.println(li2);
		Path fp = Paths.get("C:\\javaStudy\\empty.txt");
		fp = Files.createFile(fp); // ���ϻ����ϴµ� ������ ������ ������
		byte buf1[] = {0x13,0x14,0x15};
		for(byte b : buf1)
			System.out.print(b+"\t");
		System.out.println();
		
		Files.write(fp,buf1,StandardOpenOption.APPEND); // ���ڽ�Ʈ��, ������ �����̾� ~ ���� ����ũ���� �ؾߵǴµ� ���� ^^
		
		byte buf2[] = Files.readAllBytes(fp);
		for(byte b : buf2)
			System.out.print(b+"\t");
		System.out.println();
	}
}
