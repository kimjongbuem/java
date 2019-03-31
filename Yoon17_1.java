package test;

public class Yoon17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable prn = new Printer(); // 참조변수선언가능해 ㅎㅎ
		prn.print("hello");
	}

}
interface Printable{ // 인스턴스 생성불가. 
	public static final int PAPER_WIDTH = 70;
	public static final int PAPER_HEIGHT = 70;
	public void print(String doc); // 참조변수선언가능하다. 메소드 몸체는 없음
	// 해당 인터페이스를 선언하고 참조변수로 쓸떄 인터페이스로 선언 된 형 + 
	// 인터페이스 문법을 가진 클래스를 참조할수 있다.
}
interface ColorPrintable extends Printable{
	public void printCMYK(String doc);
}
class Printer implements Printable{ // 상속이 아니야... 구현을 하는것이여.
	public void print(String doc) {
		System.out.println(doc);
	}
}