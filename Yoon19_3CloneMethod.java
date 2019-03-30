package test;



public class Yoon19_3CloneMethod {

	public static void main(String[] args) {
		// object 상속 . 클론메소드 호출 시 복사된 인스턴스 참조값이 반환 //
		// Cloneable 마크인터페이스.

//		Point org = new Point(3,5);
//		Point cpy;
		Rectangle org = new Rectangle(1,1,9,9);
		Rectangle cpy;
		try {
//			cpy = (Point)org.clone(); // clone메소드는 object클래스를 반환하기때문에 상속관계상 형변환을 시켜주어야한다.
//			org.showPosition();
//			cpy.showPosition();
//			cpy.ChangeValue(7, 6);
//			org.showPosition(); // 서로 다른 값을 나타낸다. 그말즉슨 서로다른 인스턴스란 얘기!!!
//			cpy.showPosition();
			cpy = (Rectangle)org.clone();
			cpy.showPosition();
			cpy.ChangeValue(10, 10, 10, 10);
			cpy.showPosition();
			org.showPosition();

		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();	
		}
	}

}
class Point implements Cloneable{ //implements 선언은 상속한다는 의미를 나타내긴하는데 cloneable의 인터페이스
	// 를 재정의 하겠다라는 강한 확신을가짐 즉 cloneable의 쓸 메소드만 따와서 정의 하겠다 ~.
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
	public void ChangeValue(int x, int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		// protected에서 public 바꾸기 위한 메소드 오버라이딩.
		/* Point 가 속한 패키지와 Object가 속한 패키지랑 다른 패키지에 있다..
		 * 그러니... public으로 선언하여 외부로 접근이 가능하다.
		 * */
		return super.clone(); // object 클래스의 clone 메소드 호출.
	}
}
class Rectangle implements Cloneable{
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(int x1, int y1,int x2, int y2 ) {
		upperLeft = new Point(x1,y1);
		lowerRight = new Point(x2,y2);
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		
		Rectangle copy = (Rectangle)super.clone();
		copy.upperLeft = (Point)upperLeft.clone(); // Deep copy
		copy.lowerRight = (Point)lowerRight.clone();
		return copy;
		//return super.clone();// shallow copy  여기서 rectangle은 다르게 참조되지만 해당
		// Point 객체들은 복사한 Point객체를 가리킨다... 똑같은거 가리킴..
	}
	public void showPosition() {
		upperLeft.showPosition();
		lowerRight.showPosition();
	}
	public void ChangeValue(int x1, int y1,int x2, int y2) {
		upperLeft.ChangeValue(x1, y1);
		lowerRight.ChangeValue(x2, y2);
	}
}