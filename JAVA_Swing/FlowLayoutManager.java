package JAVA_Swing;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayoutManager {

	public static void main(String[] args) {
		JFrame frm = new JFrame("FlowLayout");
		frm.setBounds(120, 120, 400, 200);
		frm.setLayout(new FlowLayout());
		frm.add(new JButton("HI")); frm.add(new JButton("Swing"));                       
		frm.add(new JButton("Cola"));
		frm.add(new LargeBTN("Hi"));
		frm.add(new LargeBTN("Swing"));
		frm.add(new LargeBTN("Cola"));
		frm.setVisible(true);
	}

}
class LargeBTN extends JButton{
	public LargeBTN(String str) {
		super(str);
	}
	public Dimension getPreferredSize() {
		Dimension largeBtmsz = new Dimension(
				super.getPreferredSize().width+30,
				super.getPreferredSize().height+15);
		
		return largeBtmsz;
	}
}