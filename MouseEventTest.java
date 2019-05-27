import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JComponent;
import javax.swing.JFrame;

class WhiteBorad extends JComponent{
	int x,y,w,h;
	
	public WhiteBorad() {
		w = 0;  y= 0; x = 0; h = 0;	
	addMouseListener(new MouseEventHdl());
	addMouseMotionListener(new MouseMotionHdl());
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.drawString("마우스로 사각형을 그리세요", 20 , 50);
		g.setColor(Color.RED);
		g.drawRect(w, y, w, h);
	}
	public void setStartPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setEndPoint(int x, int y) {
		w = Math.abs(this.x - x);
		h = Math.abs(this.y - y);
	}
	class MouseEventHdl  extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			setStartPoint(e.getX(), e.getY());
		}
		public void mouseReleased(MouseEvent e) {
			setEndPoint(e.getX(), e.getY());
			repaint();
		}
	}
	class MouseMotionHdl extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			setEndPoint(e.getX(), e.getY());
			repaint();
		}
	}
}

public class MouseEventTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("MouseEventTest");
		f.setSize(320,240);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new WhiteBorad());
		f.setVisible(true);
	}
}
