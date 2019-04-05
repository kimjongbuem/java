package test;
public class Yoon22_Generic {

	public static void main(String[] args) {
		Box<Integer> iBox = BoxFactory.makeBox();
		iBox.set(25);
		System.out.println(iBox.get());
		Box<Toy> TBox = BoxFactory.makeBox();
		TBox.set(new Toy());
		System.out.println(TBox.get());
		Box<Double> db = new Box<Double>();
		db.set(1203.12);
		TBoxFactory.peekBox(db);
		Box<Toy> car = new Box<Toy>();
		BoxHandler.InBox(car, new toyCar(12));
		BoxHandler.OutBox(car);
		BoxHandler.move(new Box<Toy>(), car);
	}

}
class BoxHandler{
	public static <T>void OutBox(Box<? extends T> box) {
		T t = box.get();
		//box.set(new T());
		System.out.println(t);
	}
	public static <T>void InBox(Box<? super T> box, T n){
		box.set(n);
		//Toy t = box.get();
	}
	public static <T>void move(Box<? super T> to, Box<? extends T> from) {
		to.set(from.get());
		System.out.println(to.get());
	}
}
class SteelBox<T> extends Box<T>{
	public SteelBox(T o) {
		ob = o;
	}
}
class TBoxFactory{
	public static <T> void makeBox(Box<T> tstBox){
		System.out.println(tstBox);
	}
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box.get()); // ªÛ¡¶«—.
	}
//	public static void peekBox(Box<? super Integer> box) {
//		System.out.println(box);
//	}
}