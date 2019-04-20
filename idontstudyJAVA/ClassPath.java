package idontstudyJAVA;

public class ClassPath {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.printName();

	}

}
class AAA{
	String a = "AAA";
	public void printName() {
		System.out.println(a);
	}
}