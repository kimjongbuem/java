package CH27;

import java.util.function.Function;

public class Yoon27_1_4 {

	public static void main(String[] args) {
		// Function<T, R>  T�� �Ű������� R�� ��ȯ��//
		Function<String, Integer> f = s-> s.length();
		System.out.println(f.apply("Robot"));
		System.out.println(f.apply("System"));
		// Function<T, T> = > UnaryOperator<T> �Ű������� ��ȯ���� ���� �� ���� ������
	}

}
