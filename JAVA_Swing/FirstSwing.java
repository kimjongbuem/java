package JAVA_Swing;
import java.awt.*;
import javax.swing.*;
public class FirstSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("myBt1");
		JButton btn2 = new JButton("myBtn2");
		JButton btn3 = new JButton("myBtn3");
		frm.add(btn1); frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
		}

}
