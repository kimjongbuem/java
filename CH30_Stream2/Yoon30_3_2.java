package CH30_Stream2;
import java.util.*;
import java.util.stream.Stream;
public class Yoon30_3_2 {

	public static void main(String[] args) {
		// 최종연산 collect //
		/*
		 * 왜 쓸까? 중간연산 데이터는 꺼내서 쓸수가 없어. 중간연산에 여러가지 최종연산을 하고싶은데... ㅠ ㅠ 
		 */
		String [] words = {"Gogurea", "Backjae","Silla","Gaya"};
		Stream<String> stm = Arrays.stream(words);
		List<String> ls = Arrays.stream(words).filter(s -> s.length() > 5).collect(() -> new ArrayList<>(),
																	(c,s) -> c.add(s),
																	(l1, l2) -> l1.addAll(l2));
		System.out.println(ls);
	}

}
