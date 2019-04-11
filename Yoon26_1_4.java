package CH26;
import java.util.*;
public class Yoon26_1_4 {

	public static void main(String[] args) {
		// 1 //
		List<String> list = new ArrayList<>();
		list.add("Robosst");
		list.add("sApple");
		list.add("Box");
		Comparator<String> cmp = new strComp();
		Collections.sort(list,cmp);
		System.out.println(list);
		// 2 //
		Comparator<String> cmp2 = new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.length() - o1.length(); //본질은 
				// 클래스 이름이 아닌 정의임.
		}
		};
		cmp2  = (String o1, String o2) -> o1.length() - o2.length();
		Collections.sort(list,cmp2);
		System.out.println(list);
//		int a = 2;
//		short b = a;
	}

}
class strComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
			return o1.length() - o2.length();
	}
	
}