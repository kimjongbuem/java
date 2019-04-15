package CH33_NIO_NIO2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
public class CH33_1_4 {

	public static void main(String[] args) throws IOException {
		Path src = Paths.get("C:\\javaStudy\\empty.txt");
		Path dst = Paths.get("C:\\javaStudy\\empty2.txt");
		Files.copy(src, dst,StandardCopyOption.REPLACE_EXISTING);
		
		Path src2 = Paths.get("C:\\javaStudy\\Dir1");
		Path dst2 = Paths.get("C:\\javaStudy\\Dir2");// dir1 디렉터리 -> dir2
		Files.move(src2, dst2, StandardCopyOption.REPLACE_EXISTING);
	}

}
