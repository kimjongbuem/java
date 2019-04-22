package JAVA_Swing;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class EventHandler {

	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("myBt1");
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		JButton btn2 = new JButton("myBtn2");
		btn2.addMouseListener(listener);
		JButton btn3 = new JButton("myBtn3");
		btn3.addMouseListener(listener);
		frm.add(btn1); frm.add(btn2);                       
		frm.add(btn3);
		frm.setVisible(true);
		
	}

}
class MouseEventHandler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button"+e.getButton());
		System.out.println("마우스 버튼 눌렸다 풀림.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 버튼 눌림");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("커서 버튼 풀림");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("커서 버튼위 진입!");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("커서 버튼위 탈출");
	}
	
}