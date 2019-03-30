package test;



public class Yoon19_3CloneMethod {

	public static void main(String[] args) {
		// object ��� . Ŭ�и޼ҵ� ȣ�� �� ����� �ν��Ͻ� �������� ��ȯ //
		// Cloneable ��ũ�������̽�.

//		Point org = new Point(3,5);
//		Point cpy;
		Rectangle org = new Rectangle(1,1,9,9);
		Rectangle cpy;
		try {
//			cpy = (Point)org.clone(); // clone�޼ҵ�� objectŬ������ ��ȯ�ϱ⶧���� ��Ӱ���� ����ȯ�� �����־���Ѵ�.
//			org.showPosition();
//			cpy.showPosition();
//			cpy.ChangeValue(7, 6);
//			org.showPosition(); // ���� �ٸ� ���� ��Ÿ����. �׸��ｼ ���δٸ� �ν��Ͻ��� ���!!!
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
class Point implements Cloneable{ //implements ������ ����Ѵٴ� �ǹ̸� ��Ÿ�����ϴµ� cloneable�� �������̽�
	// �� ������ �ϰڴٶ�� ���� Ȯ�������� �� cloneable�� �� �޼ҵ常 ���ͼ� ���� �ϰڴ� ~.
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
		// protected���� public �ٲٱ� ���� �޼ҵ� �������̵�.
		/* Point �� ���� ��Ű���� Object�� ���� ��Ű���� �ٸ� ��Ű���� �ִ�..
		 * �׷���... public���� �����Ͽ� �ܺη� ������ �����ϴ�.
		 * */
		return super.clone(); // object Ŭ������ clone �޼ҵ� ȣ��.
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
		//return super.clone();// shallow copy  ���⼭ rectangle�� �ٸ��� ���������� �ش�
		// Point ��ü���� ������ Point��ü�� ����Ų��... �Ȱ����� ����Ŵ..
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