package test;

public class Yoon20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⺻ �ڷ��� ���� ���δ� �ν��Ͻ�? ����Ŭ���� !
		// �⺻�ڷ����� object Ŭ������ ���谡����.
		Integer iInst = new Integer(3);
		showData(iInst);
		showData(new Double(7.15));
		Integer iObj = new Integer(10); // �ڽ��� �ν��Ͻ� ������ ����.
		Double dObj = new Double(3.14);
		int num1 = iObj.intValue( ); //���� ���� ���� �ƴ�.. ok? ��ڽ��� �޼ҵ带 ����,
		double num2 = dObj.doubleValue( );
		Integer n1 = Integer.valueOf(5); // == new Integer(5) �� ����� ���� !!
		Integer n2 = Integer.valueOf(2262);
		System.out.println("ū �� : " + Integer.max(n1,n2));
		System.out.println("���� �� : " + Integer.min(n1,n2));
		System.out.println("�� : " + Integer.sum(n1,n2));
		System.out.println("12�� 16�� ǥ�� : "+ Integer.toHexString(12));
	}
	public static void showData(Object obj) {
		System.out.println(obj); // toString �޼ҵ� ȣ�� �ϰ� println ȣ��
	}
//	public String toString() {
//		return string object
//	}
}
