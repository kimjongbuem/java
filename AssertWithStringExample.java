
public class AssertWithStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawBox(10, 20);
		drawBox(10, -80);
		System.out.println("?");
	}
	static void drawBox(int x, int y) {
		assert x>=0; assert y>=0;
	}
}
