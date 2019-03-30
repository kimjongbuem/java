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
		System.out.println("end of Program");
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