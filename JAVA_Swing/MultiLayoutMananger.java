package JAVA_Swing;
import java.awt.*;
import javax.swing.*;
public class MultiLayoutMananger {

	public static void main(String[] args) {
	JFrame frm = new JFrame("GridLayout Test");
	frm.setBounds(120,120,250,200);
	frm.setLayout(new BorderLayout());
	JButton btm1 = new JButton("b1");
	JButton btm2 = new JButton("b2");
	JButton btm3 = new JButton("b3");
	JButton btm4 = new JButton("b4");
	JButton btm5 = new JButton("b5");
	JButton btm6 = new JButton("b6");
	JButton btm7 = new JButton("b7");
	JButton btm8 = new JButton("b8");
	JButton btm9= new JButton("b9");
	JButton btm10 = new JButton("b10");
	
	JPanel panel1 = new JPanel();
	panel1.setLayout(new FlowLayout());
	panel1.add(btm1); panel1.add(btm2);
	panel1.add(btm3); panel1.add(btm4);
	JPanel panel2 = new JPanel();
	panel2.setLayout(new GridLayout(2,3,2,2));
	panel2.add(btm5); panel2.add(btm6); panel2.add(btm7); 
	panel2.add(btm8); panel2.add(btm9); panel2.add(btm10);
	
	frm.add(panel1,BorderLayout.NORTH);
	frm.add(panel2,BorderLayout.CENTER);
	frm.setVisible(true);

}
}
