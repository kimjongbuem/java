package CH27;

public class Yoon27_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Լ����������̽���? �߻�޼ҵ尡 ���� �ϳ��� �������̽��� �ǹ��Ѵ�.
		// �ν��Ͻ����� ����ϳ��� �ʿ��� ...
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
