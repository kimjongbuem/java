package CH33_NIO_NIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CH33_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path pt1 = Paths.get("C:\\Users\\user\\eclipse-workspace\\test\\src\\CH33_ADD_IO");
		Path pt2 = pt1.getRoot();
		Path pt3 = pt1.getParent();
		Path pt4 = pt1.getFileName();
		
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3);
		System.out.println(pt4);
		
		Path cur = Paths.get(""); //빈문자전달
		String cdir = "Not";
		if(cur.isAbsolute()) 
			cdir = cur.toString();
		else
			cdir = cur.toAbsolutePath().toString(); // 현재디렉토리
		System.out.println(cdir);
	}

}
