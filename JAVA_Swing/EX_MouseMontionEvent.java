package JAVA_Swing;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;
import javax.swing.*;
public class EX_MouseMontionEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Move Motion");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		frm.addMouseMotionListener(new MouseMotionHandler());
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JFrame test = new JFrame("Mouse Motion2");
		test.setBounds(120,120,400,100);
		test.setLayout(new FlowLayout());
		
		test.addMouseListener(new MouseEventHandlerOmit());
		test.setVisible(true);
		test.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
class MouseMotionHandler implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.printf("Drag : [%d %d]",e.getX(),e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.printf("Move : [%d %d]",e.getX(),e.getY());
	}
}
class MouseEventHandlerOmit extends MouseAdapter{
	public void mouseClicked(MouseEvent e) {
		System.out.println("버튼 클릭됨 ^^"); // 마우스리스너 인터페이스 구현 함수가 너무많아서 ...
	} 
}