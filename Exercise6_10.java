package test;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.awt.*;
public class Exercise6_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		
		RectangleInfo r = new RectangleInfo();
		CircleInfo c = new CircleInfo();
		HandlerDrawFigure handler = new HandlerDrawFigure(r,c);
		//JFrame  frame = new JFrame();
		List<figure> f = Arrays.asList(r,c);
		f  = new ArrayList<>(f);
		Optional<List<figure>> option = Optional.of(f);
//		figure s = option.map( (s,r) ->{
//			
//		})
//					map(HandlerDrawFigure::getCircleInfo).
//					orElse(f.get(0));
//				frame.setSize(400, 400);
//		frame.setTitle("원, 사각형 그리기");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.add(handler);
//		
//		
//		frame.setVisible(true);
	}

}

abstract class figure extends JComponent{
	abstract void area(Graphics g);
	abstract void girth(Graphics g);
	abstract void draw(Graphics g);
}
class CircleInfo extends figure{
	private int x, y;
	private double width, height;
	public static double pie = 3.141592;
	CircleInfo(int sx, int sy, int width, int height){
		x = sx; y = sy;
		this.width = width; this.height = height;
	}
	CircleInfo(){
		x = 20; width = 100;
		y = 160; height = 100;
	}
	public void paintComponent(Graphics g) {
		area(g);
		girth(g);
		draw(g);
	}
	void area(Graphics g) {
		double area = pie*(width/2)*(height/2);
		String result = "원 넓이  : "+area;
		g.drawString(result, 160, 160);
	}
	void girth(Graphics g) {
		double round = pie*2*(width/2);
		String result = "원 둘레  : "+ round;
		g.drawString(result, 160, 240);
	}
	void draw(Graphics g) {
		g.fillOval(x, y, (int)width, (int)height);
	}
}
class RectangleInfo extends figure{
	private int x, y;
	private int width, height;
	RectangleInfo(int sx, int sy, int width, int height){
		x = sx; y = sy;
		this.width = width; this.height = height;
	}
	RectangleInfo(){
		x = 20; width = 100;
		y = 20; height = 120;
	}
	public void paintComponent(Graphics g) {
		area(g);
		girth(g);
		draw(g);
	}
	void area(Graphics g) {
		double area = height*width;
		String result = "사각형 넓이  : "+area;
		g.drawString(result, 160, 40);
	}
	void girth(Graphics g) {
		double round = 2*(width + height);
		String result = "사각형 둘레  : "+ round;
		g.drawString(result, 160, 120);
	}
	void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}
class HandlerDrawFigure extends JComponent{
	RectangleInfo r;
	CircleInfo c;
	HandlerDrawFigure(RectangleInfo r, CircleInfo c){
		this.r =r;
		this.c =c;
	}
	public void paintComponent(Graphics g) {
		r.paintComponent(g);
		c.paintComponent(g);
	}
	RectangleInfo getRectInfo() {
		return r;
	}
	CircleInfo getCircleInfo(int b) {
		return c;
	}
}