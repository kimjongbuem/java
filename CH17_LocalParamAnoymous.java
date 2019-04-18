package CH26;

public class CH17_LocalParamAnoymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out = new OuterClass("My OuterClass");
		Readable reads = out.createLocalClassInst(111);
		reads.read();
	}

}
interface Readable{
	public void read();
}

class OuterClass{
	private String myName;
	OuterClass(String name){
		myName = name;
	}
	public Readable createLocalClassInst(final int instID) {
//		1 ... local 
//			class LocalClass implements Readable{
//			public void read() {
//				System.out.println(myName);
//				System.out.println(instID);
//			}
//		}
//		return new LocalClass();
//		2... 익명클래스 
//			return new Readable() {
//			public void read() {
//				System.out.println(myName);
//				System.out.println(instID);
//			}
//		};
		// 3 람다
		return () -> {
			System.out.println(myName);
			System.out.println(instID);
		};
	}
}