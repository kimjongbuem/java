package test;

public class Yoon_21_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Box<Toy> aBox= new Box<>();
		DBox<String, Integer> dbox = new DBox<>();
		dbox.set("Apple",123);
		System.out.println(dbox);
		Box<Integer> intN = new Box<Integer>();
		intN.set(123456); //����ڽ�
		System.out.println(intN.get()); // �����ڽ�
	}

}
class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	public String toString() {
		return left +"&" +right;
	}
}
class BoxFactory{
	public static <T extends Number>Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}
class Box<T extends Number>{ // ���׸�ȭ //
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public int toIntValue() { // extends ���� �� ����
		return ob.intValue();
	}
}
class Toy{
	private String st;
	Toy(String s){
		st = s;
	}
}
class toyCar extends Toy{
	int fuel;
	toyCar(String s, int fuel){
		super(s); // ����ϴ� ����Ŭ���� ������ ����
		this.fuel = fuel;
	}
}
class toyTrain extends Toy{
	int age;
	 toyTrain(String s, int age){
		super(s); // ����ϴ� ����Ŭ���� ������ ����
		this.age = age;
	}
}