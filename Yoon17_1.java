package test;

public class Yoon17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable prn = new Printer(); // �����������𰡴��� ����
		prn.print("hello");
	}

}
interface Printable{ // �ν��Ͻ� �����Ұ�. 
	public static final int PAPER_WIDTH = 70;
	public static final int PAPER_HEIGHT = 70;
	public void print(String doc); // �����������𰡴��ϴ�. �޼ҵ� ��ü�� ����
	// �ش� �������̽��� �����ϰ� ���������� ���� �������̽��� ���� �� �� + 
	// �������̽� ������ ���� Ŭ������ �����Ҽ� �ִ�.
}
interface ColorPrintable extends Printable{
	public void printCMYK(String doc);
}
class Printer implements Printable{ // ����� �ƴϾ�... ������ �ϴ°��̿�.
	public void print(String doc) {
		System.out.println(doc);
	}
}