package CH25;

public class Yoon25_1 {

	public static void main(String[] args) {
		// Enum �� �� �� ��?
		// ���� �ڷ��� ������� �����Ͽ� �������� ���δ�.
		// ������ ���� ��ü -- > �ν��Ͻ���.//
		System.out.println(Person.MAN+"\t"+Person.WOMAN);
		System.out.println(Person.Baby);
	}
	enum Person{
		Baby, MAN(29), WOMAN(25); // public static final Person Man = new Person(29);
		int age;
		private Person() {
			System.out.println("default Constructor"); // ������..? �ν��Ͻ�! 
		}
		private Person(int age) {  // private �������� ���������� �Ұ��ϴ�.
			this.age = age;
		}
		@Override
		public String toString() {
			return "I am a do Person";
		}
	}
}
