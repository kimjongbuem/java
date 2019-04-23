package JAVA_Swing;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class JFrameWindowsEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm1 = new JFrame("Frame One");
		JFrame frm2 = new JFrame("Frame Two");
		frm1.setBounds(120,120,250,150);
		frm2.setBounds(380,120,250,150);
		frm1.addWindowListener(new WindowEventHandler("Frame One"));
		frm2.addWindowListener(new WindowEventHandler("Frame Two"));
		frm1.add(new JButton("b1")); frm2.add(new JButton("b2"));
		frm1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// 따로따로 종료시키기 위함 - > System.exit(0) 이거쓰면 다종료.. ㅇㅇ//
		frm1.setVisible(true); frm2.setVisible(true);
	}

}
class WindowEventHandler implements WindowListener{
	String frameInfo;
	public WindowEventHandler(String str) {
		frameInfo = str;
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println(frameInfo+" WindowOpened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JFrame frm = (JFrame)e.getWindow();
		frm.dispose();
		System.out.println(frameInfo+" windowClosing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println(frameInfo+" WindowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println(frameInfo+" windowIConified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println(frameInfo+" WindowDEConified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println(frameInfo+"windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println(frameInfo+" windowDeactivated");
	}
	
}