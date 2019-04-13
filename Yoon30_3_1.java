package CH30_Stream2;

import java.util.stream.IntStream;

public class Yoon30_3_1 {

	public static void main(String[] args) {
		// 최종 연산 중 리덕션 : sum, count + Optional로 싸서 반환하는 average, min, max//
		// forEach //
		// allMacth anyMatch noneMatch //
		boolean b = IntStream.of(1,2,3,4,5).allMatch(i -> i%2 == 0);
		System.out.println(b); // 다맞으면 트루 
		
		b = IntStream.of(1,2,3,4,5).anyMatch(i -> i%2 == 0);
		System.out.println(b); // 하나라도 맞으면 트루 
		
		b = IntStream.of(1,2,3,4,5).noneMatch(i -> i%2 == 0);
		System.out.println(b); // 하나도 맞지 않아야 트루
	}

}
