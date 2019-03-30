package test;



public class Yoon19_3CloneMethod {

	public static void main(String[] args) {
		// object ��� . Ŭ�и޼ҵ� ȣ�� �� ����� �ν��Ͻ� �������� ��ȯ //
		// Cloneable ��ũ�������̽�.

		Point org = new Point(3,5);
		Point cpy;
		try {
			cpy = (Point)org.clone(); // clone�޼ҵ�� objectŬ������ ��ȯ�ϱ⶧���� ��Ӱ���� ����ȯ�� �����־���Ѵ�.
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
		// protected���� public �ٲٱ� ���� �޼ҵ� �������̵�.
		return super.clone(); // object Ŭ������ clone �޼ҵ� ȣ��.
	}
}
