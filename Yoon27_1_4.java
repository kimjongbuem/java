package CH27;

import java.util.function.Function;

public class Yoon27_1_4 {

	public static void main(String[] args) {
		// Function<T, R> //
		Function<String, Integer> f = s-> s.length();
		System.out.println(f.apply("Robot"));
		System.out.println(f.apply("System"));
	}

}
