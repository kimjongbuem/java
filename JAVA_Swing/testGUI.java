package TelephoneProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class testGUI {

	public static void main(String[] args) {
		JFrame frm  = new JFrame("PhoneBook_Ver0.9");
		
		frm.setBounds(120,120,400,400);
		frm.setLayout(new FlowLayout());
		
		/* search */
		Border btnSearchBorder = BorderFactory.createEtchedBorder();
		btnSearchBorder = BorderFactory.createTitledBorder(btnSearchBorder,"Search");
		JButton srhBtn = new JButton("SEARCH");
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(new FlowLayout());;
		searchPanel.setBorder(btnSearchBorder);
		JTextField searchText = new JTextField(10);
		//searchPanel.
		searchPanel.add(searchText); searchPanel.add(srhBtn);
		frm.add(searchPanel,BorderLayout.NORTH);
		
		/*Borad info*/
		Border btnInfoBorder = BorderFactory.createEtchedBorder();
		btnInfoBorder= BorderFactory.createTitledBorder(btnInfoBorder,"Information Board");
		JTextArea ar = new JTextArea(10,20);
		ar.append("찾으시는 정보를 알려드립니다! \n");
		ar.setCaretPosition(ar.getText().length());
		ar.setLineWrap(true);
		ar.setWrapStyleWord(true);
		JScrollPane simpleScroll = new JScrollPane(ar, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frm.add(simpleScroll,BorderLayout.CENTER);
		/*Delete*/
		Border btnDeleteBorder = BorderFactory.createEtchedBorder();
		btnDeleteBorder= BorderFactory.createTitledBorder(btnDeleteBorder,"Delete");
		JButton delBtn = new JButton("Delete");
		JPanel deletePanel = new JPanel();
		deletePanel.setLayout(new FlowLayout());;
		deletePanel.setBorder(btnDeleteBorder);
		JTextField deleteText = new JTextField(10);
		deletePanel.add(deleteText); 
		deletePanel.add(delBtn);
		frm.add(deletePanel,BorderLayout.SOUTH);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
