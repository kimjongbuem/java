package JAVA_Swing;

import java.awt.*;

import javax.swing.*;

public class BorderLayoutManager {

	public static void main(String[] args) {
//		JFrame frm = new JFrame("BorderLayout Test");
//		frm.setBounds(120,120,300,200);
//		frm.setLayout(new BorderLayout());
//		
//		frm.add(new JButton("EAST"), BorderLayout.EAST);
//		frm.add(new JButton("WEST"), BorderLayout.WEST);
//		frm.add(new JButton("CENTER"), BorderLayout.CENTER);
//		frm.add(new JButton("SOUTH"), BorderLayout.SOUTH);
//		frm.add(new JButton("NORTH"), BorderLayout.NORTH);
//		frm.setVisible(true);
		
		JFrame frm = new JFrame("GridLayout Test");
		frm.setBounds(120,120,300,200);
		frm.setLayout(new GridLayout(4,1));
		
		frm.add(new JButton("One"));frm.add(new JButton("Two"));
		frm.add(new JButton("Three"));frm.add(new JButton("Four"));
		frm.add(new JButton("Five"));frm.add(new JButton("Six"));
		frm.setVisible(true);
	}

}
