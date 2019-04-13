
package CH29_Stream1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Yoon29_1_1 {

	public static void main(String[] args) {
		// 스트림의 이해 //
		int []ar = {1,2,3,4,5};
		// 인트형 스트림은 인트형 배열로 스트림 생성 시 이 자료형을 받음 //
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter(n -> n%2== 1);
		System.out.println(stm2.sum());
		
		// 실전 스트림 //
		System.out.println(Arrays.stream(ar).filter(n->n%2 == 1).sum()); // 최종연산
	}

}
