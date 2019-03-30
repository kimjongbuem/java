package test;

public class CH19_2FinallizeAndEquals {

	public static void main(String[] args) {
		// object class method //
		// �ڹٰ���ӽ��� heap�� �ִ� �������� �ϴ� üũ�ϰ� ���α׷��� ������ heap������ 
		// ������ �� ��ü�Ҹ�� finalize�� �����Ų��. �ֳ��ϸ� ���۾��� �����ɸ��� �����̴�.
		// ������ �÷����� �޸𸮰����� ����ֱ����� �ϴ°ǵ�,,, ���ʿ䰡���� ���. 
		// �� ���α׷� ����� ���� ������ �÷��� ���� ���Ѵ�. => �׷��� finalize ȣ�����...
		Person p1 = new Person("Yoon");
		Person p2 = new Person("Park");
		p1 = null;
		p2 = null;
//		System.gc();
//		System.runFinalization(); -> ȣ������Ź�� �ФФФФ�
		INum num1 = new INum(10);
		INum num2 = new INum(10);
		INum num3 = new INum(10);
		if(num1.equals(num2)) // == �̰͵� ������ �ν��Ͻ���? �ǹ̰���.
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		System.out.println("end of Program");
	}

}
class INum{
	private int num;
	public INum(int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num) // �׷��� ���� �Ը���� ���� �� 
			return true;
		else 
			return false;
	}
}
class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
	@Override
	protected void finalize()throws Throwable{
		super.finalize();// �����۾�
		System.out.println("destroyed " + name); // �̰� �߰��ϰ�;� ����
	}
}