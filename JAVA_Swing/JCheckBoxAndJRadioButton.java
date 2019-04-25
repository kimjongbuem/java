package JAVA_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JCheckBoxAndJRadioButton {

	public static void main(String[] args) {
		JFrame frm = new JFrame("CheckBox & RadioButton");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new GridLayout(0,1));
		JCheckBox checkBox = new JCheckBox("Are you a programmer");
		JRadioButton btn1 = new JRadioButton("I like C");
		JRadioButton btn2 = new JRadioButton("I like C++");
		JRadioButton btn3 = new JRadioButton("I like Java",true);
		ButtonGroup group = new ButtonGroup();
		group.add(btn1); group.add(btn2); group.add(btn3);
		
		checkBox.addItemListener(new CheckBoxHandler(btn1,btn2,btn3));
		frm.add(checkBox); frm.add(btn1); frm.add(btn2); frm.add(btn3);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		
		btn1.addItemListener((e) -> {
			if(e.getStateChange() == ItemEvent.SELECTED)
				System.out.println("I like C too");
		});
		btn2.addItemListener((e) -> {
			if(e.getStateChange() == ItemEvent.SELECTED)
				System.out.println("I like C++ too");
		});
		btn3.addItemListener((e) -> {
			if(e.getStateChange() == ItemEvent.SELECTED)
				System.out.println("I like Java too");
		});
		
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
class CheckBoxHandler implements ItemListener{
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	public CheckBoxHandler(JRadioButton btn12, JRadioButton btn22, JRadioButton btn32) {
		btn1 = btn12;
		btn2 = btn22;
		btn3 = btn32;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
		}
		else {
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
		}
		
	}
	
}