package CH26;

public class Yoon26_1 {

	public static void main(String[] args) {
		Outer.Nested1 n1 = new Outer.Nested1();
		Outer.Nested2 n2 = new Outer.Nested2();
		n1.add(10);
		System.out.println(n1);
		System.out.println(n2); // private static ��Ӻ��� ���� !
		
	}

}
class Outer{ // ���Ŭ����
	private static int num = 0;
	static class Nested1{
		void add(int n) {num+=n;}
		public String toString() {
			return "�� : "+num;
		}
	}
	static class Nested2{
		public String toString() {
			return "�� : "+num;
		}
	}
}