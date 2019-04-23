package JAVA_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
public class JButtonMouseEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Disable");
		frm.setBounds(120,120,250,150);
		frm.setLayout(new FlowLayout());
		
//		MouseListener handler = new MouseEventHandler2();
		JButton b1 = new JButton("b1");
//		b1.addMouseListener(handler);
		JButton b2 = new JButton("b2");
//		b2.addMouseListener(handler);
		ActionListener l = new ActionEventHandler();
		b1.addActionListener(l);
		b2.addActionListener(l);
		frm.add(b1); frm.add(b2);
		b1.setEnabled(false);
		frm.setVisible(true);
	}

}
class ActionEventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	
}
class MouseEventHandler2 implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 버튼 눌렸다 풀림!");
		
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