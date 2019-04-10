package CH26;

public class Yoon26_2 {

	public static void main(String[] args) {
		// 익명클래스 //
		Printable prn = new Printable() {
			@Override
			public void printString(String s) {
				System.out.println(s);
			}
		}; 
		prn.printString("Hello WOrld");
	}
	// 인스턴스를 만든다.
	Print p = (String s) -> { System.out.println(s);}; // 얘는 더줄이면 (s)-> { ...;};
		// 람	다  //
	// 컴파일러는 new Printable 없어도 인식가능  + 
	// 
	//Printable prn2 = (String s) -> { System.out.println(s); };
		// 람다표현식은 인터페이스 디폴트 메소드 표현불가.
}
interface Print{
	void print(String s);
}