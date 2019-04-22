package JAVA_Swing;

import java.awt.*;

public class First_AWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frm = new Frame("First AWT");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		Button btn1 = new Button("myBt1");
		Button btn2 = new Button("myBtn2");
		Button btn3 = new Button("myBtn3");
		frm.add(btn1); frm.add(btn2);                       
		frm.add(btn3);
		frm.setVisible(true);
		}

}
