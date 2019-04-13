package CH29_Stream1;

import java.util.Arrays;
import java.util.List;

public class Yoon29_2 {

	public static void main(String[] args) {
		// 대표적 중간 연산 필터링과 맵핑 //
		/* 필터링
		 * 람다식으로 기준으로 해당 데이터를 걸러낸다! filter!
		 * 
		 * 맵핑 
		 * 각 인스턴스에 번호를 맵핑한다.. 
		 * 이길동 1번
		 * 김동섭 2번
		 * 한동욱	3번
		 * 
		 * 맵핑 조건은 height라는 조건으로 인해 나열.
		 * 맵핑은 람다식을 기준으로 조건으로 인해 바뀐다.
		 * 즉 맵핑은 데이터를 바꾼다! Change!
		 */
		// filtering //
		List<String> list = Arrays.asList("TOY", "Robot","Carfffff");
		list.stream().filter(s -> s.length() == 3).forEach(s->System.out.print(s+"\t"));
		System.out.println();
		//Maping//
		list.stream().mapToInt(s -> s.length()/2).forEach(s->System.out.print(s+"\t")); // 박싱언박싱 안할래 //
	}

}
