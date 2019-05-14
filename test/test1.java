package test;
import javax.swing.*;
public class test1 {
	public static void main(String[]args){
	
//		JFrame frame = new JFrame("HelloWorldSwing");
//		JLabel label = new JLabel("Hello World");
//		
//		frame.getContentPane().add(label);
//		frame.pack();
//		frame.setVisible(true);
		int[] a = new int[1];
		int[] b = new int[1];
		a[0] = 5; b[0]= 3;
		System.out.println(a[0]+"\t"+b[0]);
		Swap(a,b);
		
		System.out.println(a[0]+"\t"+b[0]);
	}
	public static void Swap(int[] a, int[] b) {
		int[] temp =  new int[1];
		temp[0] = a[0];
		a[0] = b[0];
		b[0] = temp[0];
	}
}
