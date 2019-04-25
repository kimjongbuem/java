package JAVA_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class JRadioButtonBorders {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Border");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		JCheckBox checkBox = new JCheckBox("Are you Programer?");
		JRadioButton btn1 = new JRadioButton("I like C");
		JRadioButton btn2 = new JRadioButton("I like C++");
		JRadioButton btn3 = new JRadioButton("I like Java",true);
		ButtonGroup group = new ButtonGroup();
		group.add(btn1); group.add(btn2); group.add(btn3);
		
		Border btnBorder = BorderFactory.createEtchedBorder();
		btnBorder = BorderFactory.createTitledBorder(btnBorder,"Language");
		
		JPanel btnJPanelBorder = new JPanel();
		btnJPanelBorder.setLayout(new GridLayout(0,1));
		btnJPanelBorder.setBorder(btnBorder);
		btnJPanelBorder.add(btn1);
		btnJPanelBorder.add(btn3);
		btnJPanelBorder.add(btn2);
		
		checkBox.addItemListener(new CheckBoxHandler(btn1,btn2,btn3));
		frm.add(checkBox); frm.add(btnJPanelBorder);
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
