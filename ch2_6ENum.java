package test;
enum Color{red, blue, green}
enum Week{Sunday(0), Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(32),Satuerday(64);
	
private final int value;
	Week(int value){ this.value = value;}
	
	public int value() { return value;}
}
public class ch2_6ENum {

	public static void main(String[] args) {
		for(Color col : Color.values())
		{
			System.out.println(col);	
		}
		
		
		Color c = Color.red;
		System.out.println(c + "'s value is" +c.ordinal());
		
		c = Color.valueOf("green");
		System.out.println(c + "'s value is" +c.ordinal());
	for(Week w : Week.values()) {
		System.out.println(w + ": oridinal=" + w.ordinal() + "value," + w.value());
	}
}}