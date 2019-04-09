package CH25;

public class Yoon25_2 {

	public static void main(String[] args) {
		ShowAll("Box","Melon");
		ShowAll("Box");
		ShowAll("Box","Melon","kakak");

	}
	public static void ShowAll(String... vars) { // String 인스턴스 몇개든지 받아주겠디 배열의 참조변수이니
		for(String s : vars)
			System.out.print(s+"\t"); // 배열처럼 쓰장!
		System.out.println();
	}
}
