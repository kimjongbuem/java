package test;

public class Yoon_21_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Box<Toy> aBox= new Box<>();
		DBox<String, Integer> dbox = new DBox<>();
		dbox.set("Apple",123);
		System.out.println(dbox);
		Box<Integer> intN = new Box<Integer>();
		intN.set(123456); //오토박싱
		System.out.println(intN.get()); // 오토언박싱
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
class Box<T extends Number>{ // 제네릭화 //
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public int toIntValue() { // extends 제한 전 오류
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
		super(s); // 상속하는 상위클래스 생성자 ㄱㄱ
		this.fuel = fuel;
	}
}
class toyTrain extends Toy{
	int age;
	 toyTrain(String s, int age){
		super(s); // 상속하는 상위클래스 생성자 ㄱㄱ
		this.age = age;
	}
}