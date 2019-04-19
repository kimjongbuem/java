package idontstudyJAVA;

public class TestEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1,1,3,5);
		Rectangle r2 = new Rectangle(1,1,3,5);
		Rectangle r3 = new Rectangle(1,1,3,3);
		r1.equals(r2);
		r1.equals(r3);
		r2.equals(r3);
		r2.equals(r1);
		Point a = new Point(3,5);
		Point cpy;
		try {
			cpy = (Point)a.clone();
			cpy.showPosition();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
class Point implements Cloneable{
	int xpos, ypos;
	public Point(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	public void showPosition() {
		System.out.printf("[%d %d]\n",xpos,ypos);
	}
	public boolean equals(Point p) {
		if(xpos == p.xpos && ypos == p.ypos)
			return true;
		else
			return false;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
class Rectangle{
	Point a,b;
	public Rectangle(int xpos1,int ypos1,int xpos2,int ypos2) {
		a = new Point(xpos1,ypos1);
		b = new Point(xpos2,ypos2);
	}
	public void showPosition() {
		System.out.print("좌상단 :");
		a.showPosition();
		System.out.print("우하단 :");
		b.showPosition();
	}
	public boolean equals(Rectangle r) {
		if(a.equals(r.a) && b.equals(r.b))
		{
			System.out.println("같습니다.");
			return true;
		}
			
		else {
			System.out.println("다릅니다.");
			return false;
		}
	}
}