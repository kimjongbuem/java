package JAVA_Swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Exercise_Swing_Q2 {

	public static void main(String[] args) {
		MyJFrame frm = new MyJFrame("Second Swing");
		JButton btn1 = new JButton("myBt1");
		RevisedMouseEventHandler listener = new RevisedMouseEventHandler();
		btn1.addMouseListener(listener);
		JButton btn2 = new JButton("myBtn2");
		JButton btn3 = new JButton("myBtn3");
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		frm.add(btn1); frm.add(btn2);                       
		frm.add(btn3);
		frm.setVisible(true);
	}
}
class MyJFrame extends JFrame{
	MyJFrame(String s){
		super(s);
		super.setBounds(120,120,400,400);
		super.setLayout(new FlowLayout());
		addMouseListener(new FrameMouseEventHandler());
	}
}