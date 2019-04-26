package TelephoneProject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

//import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
class PhoneBookGUI_Manager extends JFrame {
		
	PhoneBookGUI_Manager(){
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
		ar.append("������ �˻� �� ����\n");
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
		
		srhBtn.addActionListener(new SearchButtonHandler(ar,searchText));
		delBtn.addActionListener(new DeleteButtonHandler(ar,deleteText));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	class SearchButtonHandler implements ActionListener{
		JTextArea textArea;
		JTextField textField;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(PhoneBookManager.getCount() == 0) {
				textArea.append("ã�� �����Ͱ� �����ϴ�");
				return;
			}
			textArea.append("������ �˻��� �����մϴ�...\n");
			PhoneInfo tempInfo= PhoneBookManager.search(textField.getText());
			if(tempInfo == null) {// ������ //
				textArea.append("\nã���ô� �����Ͱ� �����ϴ� !");
				return;	
			}
			else
				textArea.append(tempInfo.toString());
			textArea.append("\n������ �˻��� �Ϸ� �Ǿ����ϴ�.");

		}
		SearchButtonHandler(JTextArea textArea, JTextField textField){
			 this.textArea = textArea;
			 this.textField = textField;
		 }
	}
	class DeleteButtonHandler implements ActionListener{
		JTextArea textArea;
		JTextField textField;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(PhoneBookManager.getCount() == 0) {
				textArea.append("\n������ �����Ͱ� �����ϴ�");
				return;
			}
			textArea.append("\n������ �˻��� �����մϴ�...");
			PhoneInfo tempInfo= PhoneBookManager.search(textField.getText());
			if(tempInfo == null) {// ������ //
				textArea.append("\n�ش� �̸��� ���� ����� �����ϴ� !");
				return;
			}
			else {
				for(Iterator<PhoneInfo> i=PhoneBookManager.info.iterator();i.hasNext();) {
					if(i.next()==tempInfo) {
						i.remove();
						textArea.append("\n������ ������ �Ϸ� �Ǿ����ϴ�");
						PhoneBookManager.minusCount();
						return;
					}
				}
			}
		}
		DeleteButtonHandler(JTextArea textArea, JTextField textField){
			this.textArea = textArea;
			this.textField = textField;
		 }
	}
}