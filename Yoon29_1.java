
package CH29_Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Yoon29_1 {

	public static void main(String[] args) {
		// 스트림의 이해 //
		int []ar = {1,2,3,4,5};
		// 인트형 스트림은 인트형 배열로 스트림 생성 시 이 자료형을 받음 //
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter(n -> n%2== 1);
		System.out.println(stm2.sum());
		
		// 실전 스트림 //
		System.out.println(Arrays.stream(ar).filter(n->n%2 == 1).sum()); // 최종연산
		// 스트림 만들어서 중간연산을 하고 그 중간연산을 한 스트림의 최종연산을 진행한다라고 생각ㄱㄱㄱ //
		
		String[] names = {"Yonon", "Meclo", "RanmDa"};
		Arrays.stream(names).forEach(s->System.out.println(s)); // foreach는 최종연산
		//String 출력할 때 매우유용하다.
		
		List<String> list = Arrays.asList("Toy","RObot");
		list.stream().forEach(s->System.out.println(s));
	}

}
