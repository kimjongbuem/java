package CH29_Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Yoon29_3 {

	public static void main(String[] args) {
		// 리덕션과 병렬 스트림 //
		// 리덕션은 데이터들을 하나의 데이터로 반환하는 형태로.. 람다식으로 내가 원하는 연산을 정의 후 reduce 메소드 최종연산 //
		// reduce(T identity BinaryOperator<T> accumulator)
		// BinaryOperaotr 추상메소드 : T apply(T t1, T t2) 
		
		List<String> ls =Arrays.asList("Box","Complex","rrrrrrr","Robot");
		
		BinaryOperator<String> lc = (t1, t2) -> { // 람다식.
			if(t1.length() > t2.length())
				return t1;
			else
				return t2;
		};
		System.out.println(ls.stream().reduce("what is that?",lc)); // 먼저 box 와 complex 비교 해서 람다식기반  -> complex반환 -> complex와 rrrrrrr비교 ... 이런식.
		// 리듀스 첫번째 인자는 맨앞에 가서 추가되고 같이 경쟁한다고 봐야함. //
		
		// 병렬스트림 -> 병렬처리를 위한 작업을 나누고 취합하는 연산이 있어서 막쓰진마라.. 시간을 재서 쓰던가해라.//
		System.out.println(ls.parallelStream().reduce("",lc));
	}

}
