package CH28;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Yoon28_1_1 {

	public static void main(String[] args) {
		// static method reference //
		// 특정경우의 람다식의 단순화 약속-> 메소드참조//
		List<Integer> ls = Arrays.asList(1,3,5,7,9);
		ls = new ArrayList<>(ls);
		Consumer<List<Integer>> c = s -> Collections.reverse(s);
		c = Collections::reverse;
		c.accept(ls);
		System.out.println(ls);
		Consumer<List<Integer>> cc = new Consumer<List<Integer>>() {
			public void accept(List<Integer> t) {
				Collections.reverse(t);
			}
		};
		cc.accept(ls);
		System.out.println(ls);

	}

}
