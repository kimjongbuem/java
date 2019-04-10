package CH26;

public class Yoon26_1_2 {

	public static void main(String[] args) { // �������ΰ���
		// �̳�Ŭ���� -> ���Ŭ����/ ����Ŭ����(�޼ҵ��) / �͸�Ŭ����
			Outer2 o1 = new Outer2(); // ���� �ܺ�Ŭ���� ����
			Outer2 o2 = new Outer2(); 
			
			Outer2.Member o1m1 = o1.new Member(); // ����Ŭ���� ���������� �Լ�
			Outer2.Member o1m2 = o1.new Member();
			
			Outer2.Member o2m1 = o2.new Member(); 
			Outer2.Member o2m2 = o2.new Member();
			
			o1m1.add(5);
			System.out.println(o1m2.get());// ������ �ܺ�Ŭ�������� �޶���.
			
			o2m1.add(55);
			System.out.println(o2m2.get());
			
			// �ݺ��ڵ� ���Ŭ���� ��! // �ݺ��ڿ� ���� Ŭ������ �ְ���? �ϳ��� Ŭ������ �ƴ°� �δ��� ����.
			/*// �ش� �����͵�..
			 * public Iterator<E> iterator(){
			 * return new Itr(); // ���Ŭ������ �ν��Ͻ� ��ȯ
			 * }
			 * 
			 * private class Itr implements Iterator(){
			 * 	.... // ���Ŭ���� ���� + ������ �������� ����
			 * }
			 */
			
			// �׷� ���Ŭ������ ���� ����ϴ°�? ��Ŭ������ �����ʹ� //
			Paper p = new Paper("Paper Name");
			Printable prn = p.getPrinter();
			prn.print();
			System.out.println(prn);
	}

}
class Paper{
	private String str;
	public Paper(String s) { str =s; }
	public Printable getPrinter() {
		return new Printer();
	}
	private class Printer implements Printable{
		String strs;
		@Override
		public void print() {
			strs = str;
			System.out.println(str); // �ÿ��ڴ� PrinterŬ������ ���ʿ����. 
			// �� ��Ŭ������ �ٲ� main�� ������.
		}
		public String toString() {
			return strs;
		}
		/*
		 * ��ŷ : �� ���ο� private���� ����� ������ Ŭ������ �־��,
		 * ���⼭... �� Ŭ������ ����������� �����ϴ� �׷� ��� �ұ��?
		 * �����ÿ� ������ Ŭ������ Printable �������̽��� �����ϱ� ������ interface Printable������ 
		 * ���������� �����ϸ�, �ű�� Printer()�����ڸ� ������ָ�Ǵµ� �������� �Ұ��ϴϱ� Paper�޼ҵ��
		 * �����ϴ� �ڵ带 ������ݴϴ�. �׷��� ������ �ν��Ͻ��� Printer�ν��Ͻ��̹Ƿ� 
		 * print�Լ��� �����־ ȣ�Ⱑ����.
		 */
	}
}
class Outer2{
	private int num = 0;
	
	class Member{
		void add(int n) {num+=n;}
		int get() {return num;}
	}
}