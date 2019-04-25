package JAVA_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JScrollPanes {

	public static void main(String[] args) {
		JFrame frm = new JFrame("JTextArea");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		JTextArea ar = new JTextArea(10,20);
		ar.append("원하는 내용을 입력해라 \n");
		ar.setCaretPosition(ar.getText().length());
		ar.setLineWrap(true);
		ar.setWrapStyleWord(true);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ButtonTextHandler(ar));
		
		JScrollPane simpleScroll = new JScrollPane(ar, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		
		//frm.add(ar);
		frm.add(simpleScroll);
		frm.add(clearBtn);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
