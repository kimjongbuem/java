package CH27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Yoon27_1_5 {

	public static void main(String[] args) {
		// removeif메소드는 컬렉션인터페이스의 디폴트 메소드 //
		
		List<Integer> testInteger1 = Arrays.asList(1,4,-8,9,4,2,-46,8,989,-154,451);
		testInteger1 = new ArrayList<>(testInteger1);
		
		List<Double> testInteger2 = Arrays.asList(-1.1, 2.2 , -3.3, 5.5, 4.4);
		testInteger2 = new ArrayList<>(testInteger2);
		Predicate<Number> p = n -> n.intValue() > 0; // 공통된 조건 정의 //
		
		testInteger1.removeIf(p); testInteger2.removeIf(p);
		
		System.out.println(testInteger1);
		System.out.println(testInteger2);
		
}
}

// 6: 30 - 8: 06