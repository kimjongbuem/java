package CH33_ADD_IO;

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
	}

}
