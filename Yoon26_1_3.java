package CH26;



public class Yoon26_1_3 {

	public static void main(String[] args) {
		Paper2 p = new Paper2("Paper Name");
		Printable prn = p.getPrinter();
		Printable prn2 = p.getPrinterUpdate();
		prn.print();
		prn2.print();
		System.out.println(prn);
		System.out.println(prn2);

	}

}
interface Printable{
	default void print() {};
	default void printString(String s){};
}
class Paper2{
	private String str;
	public Paper2(String s) { str =s; }
	public Printable getPrinter() {
		class Printer implements Printable{
			@Override
			public void print() {
				System.out.println(str);
			}
		}
			return new Printer(); // 인스턴스 생성하는 목적으로만 씀ㄷㄷ 근데 줄여서 하고싶다! -> 익명클래스
			// 인터페이스가 구현결과 밖에 없는 경우, 클래스가 간단한경우.
			/* 인터페이스의 이름을 근간으로 하여 인스턴스 생성을 하도록하자.
			 * 근데 메소드가 추상메소드라 못해.. 그럼??? -> print메소드구현
			 * return new Printable(){ -> 이름이 필요없으니 익명클래스야
			 * 	public void print(){
			 * 		System.out.println(str); // 추상메소드 채워줌
			 * 		}
			 * };
			 * 
			 */
		}
	public Printable getPrinterUpdate() {
		return new Printable() { //이렇게 익명클래스 정의가능
			public void print() {
				System.out.println(str);
			}
		};
		
	}
}
