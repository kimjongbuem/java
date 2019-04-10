package CH26;

public class Yoon26_1_2 {

	public static void main(String[] args) { // 종속적인관계
		// 이너클래스 -> 멤버클래스/ 로컬클래스(메소드안) / 익명클래스
			Outer2 o1 = new Outer2(); // 먼저 외부클래스 선언
			Outer2 o2 = new Outer2(); 
			
			Outer2.Member o1m1 = o1.new Member(); // 내부클래수 지역생성자 함수
			Outer2.Member o1m2 = o1.new Member();
			
			Outer2.Member o2m1 = o2.new Member(); 
			Outer2.Member o2m2 = o2.new Member();
			
			o1m1.add(5);
			System.out.println(o1m2.get());// 각각의 외부클래스마다 달라짐.
			
			o2m1.add(55);
			System.out.println(o2m2.get());
			
			// 반복자도 멤버클래스 양! // 반복자와 같이 클래스를 왜감춰? 하나의 클래스로 아는게 부담이 덜해.
			/*// 해당 데이터들..
			 * public Iterator<E> iterator(){
			 * return new Itr(); // 멤버클래스의 인스턴스 반환
			 * }
			 * 
			 * private class Itr implements Iterator(){
			 * 	.... // 멤버클래스 정의 + 데이터 집적접근 가능
			 * }
			 */
			
			// 그럼 멤버클래스는 언제 사용하는가? 이클래스를 숨기고싶다 //
			Paper p = new Paper("Paper Name");
			Printable prn = p.getPrinter();
			prn.print();
			System.out.println(prn);
	}

}
class Paper{
	private String str;
	public Paper(String s) { str =s; }
	public Printable getPrinter() {
		return new Printer();
	}
	private class Printer implements Printable{
		String strs;
		@Override
		public void print() {
			strs = str;
			System.out.println(str); // 시용자는 Printer클래스를 알필요없음. 
			// 즉 이클래스가 바뀌어도 main은 노상관임.
		}
		public String toString() {
			return strs;
		}
		/*
		 * 토킹 : 자 내부에 private으로 선언된 프린터 클래스가 있어요,
		 * 여기서... 이 클래스는 직접만들수도 없습니다 그럼 어떻게 할까요?
		 * 생성시에 프린터 클래스는 Printable 인터페이스를 구현하기 때문에 interface Printable형으로 
		 * 참조변수를 선언하며, 거기다 Printer()생성자를 만들어주면되는데 직접접근 불가하니까 Paper메소드로
		 * 생성하는 코드를 만들어줍니다. 그러면 생성된 인스턴스는 Printer인스턴스이므로 
		 * print함수를 쓸수있어서 호출가능함.
		 */
	}
}
class Outer2{
	private int num = 0;
	
	class Member{
		void add(int n) {num+=n;}
		int get() {return num;}
	}
}