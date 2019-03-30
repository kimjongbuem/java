package test;



public class Yoon19_3CloneMethod {

	public static void main(String[] args) {
		// object 상속 . 클론메소드 호출 시 복사된 인스턴스 참조값이 반환 //
		// Cloneable 마크인터페이스.

		Point org = new Point(3,5);
		Point cpy;
		try {
			cpy = (Point)org.clone(); // clone메소드는 object클래스를 반환하기때문에 상속관계상 형변환을 시켜주어야한다.
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
		e.printStackTrace();	
		}
	}

}
class Point implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos= x;
		yPos =y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]",xPos,yPos);
		System.out.println();
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		// protected에서 public 바꾸기 위한 메소드 오버라이딩.
		return super.clone(); // object 클래스의 clone 메소드 호출.
	}
}
