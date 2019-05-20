import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JComponent;
import javax.swing.JFrame;
public class PrintStar {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setTitle("º° 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UserDefinePrintClass component = new UserDefinePrintClass();
		frame.add(component);
		frame.setVisible(true);
	}
}
class PrintClass implements IDrawStar{
	Color c; int x = 0,y = 0;
	int[] xPnts = {70,120,140,160,210,170,190,140,90,110};
	int[] yPnts = {100,100,30,100,100,140,200,160,200,140};
	public PrintClass () {}
	PrintClass (Color c){
		setColor(c);
	}
	PrintClass (Color c,int x, int y){
		setColor(c);
		this.x = x; this.y = y;
	}
	@Override
	public void setColor(Color c) {
		this.c = c;
	}

	@Override
	public void moveStar(int x, int y) {
		if(!(x==0)) {
			for(int i = 0; i<xPnts.length;i++) {
				xPnts[i]+=x;
			}
		}
		if(!(y==0)) {
			for(int i = 0; i<xPnts.length;i++) {
				yPnts[i]+=y;
			}
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		moveStar(x, y);
		g.fillPolygon(xPnts,yPnts,xPnts.length);
	}
}
class UserDefinePrintClass extends JComponent{
	/**
	 * 
	 */
	Color c; int x = 0,y = 0;
	int[] xPnts = {70,120,140,160,210,170,190,140,90,110};
	int[] yPnts = {100,100,30,100,100,140,200,160,200,140};

	public void paintComponent(Graphics g) {
		PrintClass p1 = new PrintClass(new Color(0,255,0));
		PrintClass p2 = new PrintClass(new Color(255,210,0),100,0);
		PrintClass p3 = new PrintClass(new Color(100,100,100),50,50);
		
		p1.draw(g);
		p2.draw(g);
		p3.draw(g);
	}
}
interface IDrawStar{
	void setColor(Color c);
	void moveStar(int x, int y);
	void draw(Graphics g);
}