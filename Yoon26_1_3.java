package CH26;



public class Yoon26_1_3 {

	public static void main(String[] args) {
		Paper2 p = new Paper2("Paper Name");
		Printable prn = p.getPrinter();
		Printable prn2 = p.getPrinterUpdate();
		prn.print();
		prn2.print();
		System.out.println(prn);
		System.out.println(prn2);

	}

}
interface Printable{
	default void print() {};
	default void printString(String s){};
}
class Paper2{
	private String str;
	public Paper2(String s) { str =s; }
	public Printable getPrinter() {
		class Printer implements Printable{
			@Override
			public void print() {
				System.out.println(str);
			}
		}
			return new Printer(); // �ν��Ͻ� �����ϴ� �������θ� ������ �ٵ� �ٿ��� �ϰ�ʹ�! -> �͸�Ŭ����
			// �������̽��� ������� �ۿ� ���� ���, Ŭ������ �����Ѱ��.
			/* �������̽��� �̸��� �ٰ����� �Ͽ� �ν��Ͻ� ������ �ϵ�������.
			 * �ٵ� �޼ҵ尡 �߻�޼ҵ�� ����.. �׷�??? -> print�޼ҵ屸��
			 * return new Printable(){ -> �̸��� �ʿ������ �͸�Ŭ������
			 * 	public void print(){
			 * 		System.out.println(str); // �߻�޼ҵ� ä����
			 * 		}
			 * };
			 * 
			 */
		}
	public Printable getPrinterUpdate() {
		return new Printable() { //�̷��� �͸�Ŭ���� ���ǰ���
			public void print() {
				System.out.println(str);
			}
		};
		
	}
}
