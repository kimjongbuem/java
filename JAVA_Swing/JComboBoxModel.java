package JAVA_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
class MyFriend{
	String name; int age;
	public MyFriend(String name, int age){
		this.name = name; this.age =age;
	}
	public String toString() {
		return name;
	}
	public void showFriendInfo() {
		System.out.println("name : "+name+" ³ªÀÌ : "+age);
	}
}
class ChoiceHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			System.out.println("Selected... ");
			((MyFriend)e.getItem()).showFriendInfo();
		}else {
			System.out.println("DeSelected... ");
			((MyFriend)e.getItem()).showFriendInfo();
		}	
	}
}
class TextChangedHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().compareTo("comboBoxEdited") == 0)
			System.out.println("ComboBox Edited");
		else
			System.out.println("ComboBox Changed");
	}
	
}
public class JComboBoxModel {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new GridLayout(0,2));
		
		Vector<MyFriend> friend = new Vector<MyFriend>();
		friend.add(new MyFriend("Yoon",20));
		friend.add(new MyFriend("Hong",12));
		friend.add(new MyFriend("Park",44));
		friend.add(new MyFriend("Kim",25));
		friend.add(new MyFriend("Yoon",20));
		friend.add(new MyFriend("Hong",12));
		friend.add(new MyFriend("Park",44));
		friend.add(new MyFriend("Kim",25));
		
		JLabel label1 = new JLabel(" ComboBox");
		JComboBox cmbBox1 = new JComboBox(friend);
		cmbBox1.setMaximumRowCount(3);
		cmbBox1.addItemListener(new ChoiceHandler());
		JLabel label2 = new JLabel(" Editable ComboBox");
		JComboBox cmbBox2 = new JComboBox(friend);
		cmbBox2.setEditable(true);
		cmbBox2.addActionListener(new TextChangedHandler());
		frm.add(label1); frm.add(label2); 
		frm.add(cmbBox1); frm.add(cmbBox2);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
