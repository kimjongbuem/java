package JAVA_Swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercise_Swing_Q1 {

	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("myBt1");
		RevisedMouseEventHandler listener = new RevisedMouseEventHandler();
		btn1.addMouseListener(listener);
		JButton btn2 = new JButton("myBtn2");
		JButton btn3 = new JButton("myBtn3");
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		frm.addMouseListener(new FrameMouseEventHandler());
		frm.add(btn1); frm.add(btn2);                       
		frm.add(btn3);
		frm.setVisible(true);

	}

}
class FrameMouseEventHandler implements MouseListener{

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
class RevisedMouseEventHandler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button"+e.getButton());
		System.out.println("마우스 버튼 눌렸다 풀림.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}