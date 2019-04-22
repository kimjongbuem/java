package JAVA_Swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Exercise_Swing_Q2 {

	public static void main(String[] args) {
		MyJFrame frm = new MyJFrame("Second Swing");
		frm.setVisible(true);
	}
}
class MyJFrame extends JFrame implements MouseListener{
	MyJFrame(String s){
		super(s);
		super.setBounds(120,120,400,400);
		super.setLayout(new FlowLayout());
		JButton btn1 = new JButton("myBt1");
		RevisedMouseEventHandler listener = new RevisedMouseEventHandler();
		btn1.addMouseListener(listener);
		JButton btn2 = new JButton("myBtn2");
		JButton btn3 = new JButton("myBtn3");
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		this.add(btn1); this.add(btn2);                       
		this.add(btn3);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("JFrame상에서 마우스 버튼 눌렸다 풀림~");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}