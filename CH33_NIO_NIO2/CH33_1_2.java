package CH33_NIO_NIO2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class CH33_1_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fp = Paths.get("C:\\javaStudy\\empty.txt");
		fp = Files.createFile(fp);
		Path dp1 = Paths.get("C:\\javaStudy\\Empty");
		dp1 = Files.createDirectories(dp1);
		
		Path dp2 = Paths.get("C:\\javaStudy2\\Empty");
		dp2 = Files.createDirectories(dp2);
		
	}

}
