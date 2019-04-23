package JAVA_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JLabelAndJTextField {

	public static void main(String[] args) {
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new GridLayout(2,2));
		
		JLabel idLabel = new JLabel("ID",SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		
		JLabel pwLabel = new JLabel("Password",SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField (10);
		pwText.setEchoChar('*');
		
		pwText.addActionListener(new PWHandler(idText,pwText));
//		pwText.addActionListener(e -> {
//			
//		});
		frm.add(idLabel); frm.add(idText); 
		frm.add(pwLabel); frm.add(pwText);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
class PWHandler implements ActionListener{
	JTextField idText;
	JPasswordField pwText;
	public PWHandler(JTextField idText, JPasswordField pwText) {
		this.idText = idText;
		this.pwText = pwText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ID : " + idText.getText());
		System.out.println("PassWord : " + new String(pwText.getPassword()));
		idText.setText("");
		pwText.setText("");
	}
	
}