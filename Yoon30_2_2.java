package CH30_Stream2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Yoon30_2_2 {

	public static void main(String[] args) {
		// 정렬 //
		Stream.of("Box","Apple","Robot Taegon V")
		.sorted().forEach(s->System.out.println(s));
		
		Stream.of("Box","Apple","Robot Taegon V").sorted((s1, s2) -> s2.length() - s1.length())
		.forEach(s ->System.out.println(s));
		
		// 루핑 peek은 중간연산 forEach는  최종연산// 
		IntStream.of(1,2,3,4,5).peek(d -> System.out.print(d+"\t")); //중간연산이라 최종연산없으면 실행 보류함
		System.out.println(IntStream.of(1,2,3,4,5).peek(d -> System.out.print(d+"\t")).sum());
	}

}
