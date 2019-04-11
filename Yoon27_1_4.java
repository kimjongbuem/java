package CH27;

import java.util.function.Function;

public class Yoon27_1_4 {

	public static void main(String[] args) {
		// Function<T, R>  T는 매개변수형 R은 반환형//
		Function<String, Integer> f = s-> s.length();
		System.out.println(f.apply("Robot"));
		System.out.println(f.apply("System"));
		// Function<T, T> = > UnaryOperator<T> 매개변수와 반환형이 같을 떄 쓰셈 ㄱㄱㄱ
	}

}
