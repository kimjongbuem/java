package test;

public class CH19_2FinallizeAndEquals {

	public static void main(String[] args) {
		// object class method //
		// 자바가상머신은 heap에 있는 가비지를 일단 체크하고 프로그램을 돌리며 heap공간이 
		// 부족할 떄 객체소멸시 finalize를 실행시킨다. 왜냐하면 이작업은 오래걸리기 때문이다.
		// 가비지 컬렉션은 메모리공간을 비워주기위해 하는건데,,, 할필요가없는 경우. 
		// 즉 프로그램 종료시 굳이 가비지 컬렉션 구동 안한다. => 그래서 finalize 호출안함...
		Person p1 = new Person("Yoon");
		Person p2 = new Person("Park");
		p1 = null;
		p2 = null;
//		System.gc();
//		System.runFinalization(); -> 호출좀부탁해 ㅠㅠㅠㅠㅠ
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
		super.finalize();// 기존작업
		System.out.println("destroyed " + name); // 이걸 추가하고싶엉 ㅎㅎ
	}
}