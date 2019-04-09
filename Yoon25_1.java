package CH25;

public class Yoon25_1 {

	public static void main(String[] args) {
		// Enum 을 왜 쓸 까?
		// 열거 자료형 기반으로 접근하여 안전성을 높인다.
		// 열거형 값의 정체 -- > 인스턴스임.//
		System.out.println(Person.MAN+"\t"+Person.WOMAN);
		System.out.println(Person.Baby);
	}
	enum Person{
		Baby, MAN(29), WOMAN(25); // public static final Person Man = new Person(29);
		int age;
		private Person() {
			System.out.println("default Constructor"); // 생성자..? 인스턴스! 
		}
		private Person(int age) {  // private 선언으로 직접선언이 불가하다.
			this.age = age;
		}
		@Override
		public String toString() {
			return "I am a do Person";
		}
	}
}
