package CH26;

public class Yoon26_2 {

	public static void main(String[] args) {
		// �͸�Ŭ���� //
		Printable prn = new Printable() {
			@Override
			public void printString(String s) {
				System.out.println(s);
			}
		}; 
		prn.printString("Hello WOrld");
	}
	// �ν��Ͻ��� �����.
	Print p = (String s) -> { System.out.println(s);}; // ��� �����̸� (s)-> { ...;};
		// ��	��  //
	// �����Ϸ��� new Printable ��� �νİ���  + 
	// 
	//Printable prn2 = (String s) -> { System.out.println(s); };
		// ����ǥ������ �������̽� ����Ʈ �޼ҵ� ǥ���Ұ�.
}
interface Print{
	void print(String s);
}