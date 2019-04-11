package CH27;

public class Yoon27_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 함수형인터페이스란? 추상메소드가 오직 하나인 인터페이스를 의미한다.
		// 인스턴스보다 기능하나가 필요한 ...
		// @functional Interface
		Calculates<Integer> cal = (a,b)->a*b;
		System.out.println(cal.cal(10, 20));
	}

}
@FunctionalInterface
interface Calculates<T>{
	T cal(T a, T b);
	default int add(int a, int b) {return a+b;}
	//int cal(int a);
}
