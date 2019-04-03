package test;
class Cake{
	public void yummy() {
		System.out.println("Cake yummy");
	}
}
class CheeseCake extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("CheeseCake yummy");
	}
}
class StrawBerryCheeseCake extends CheeseCake{
	public void yummy() {
		super.yummy();
		System.out.println("StrawCheeseCake yummy");
	}
}
public class Inherit {

	public static void main(String[] args) {
		Cake c1 = new Cake();
		CheeseCake c2 = new StrawBerryCheeseCake();
		StrawBerryCheeseCake c3 = new StrawBerryCheeseCake();
		c1.yummy();
		c2.yummy();
	}

}
