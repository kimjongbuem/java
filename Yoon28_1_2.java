package CH28;
import java.util.*;
import java.util.function.Consumer;
public class Yoon28_1_2 {

	public static void main(String[] args) {
		// 인스턴스 메소드 참조 1 effectively final //
		List<Integer> ls = Arrays.asList(1,3,5,7,9);
		ls = new ArrayList<>(ls);
		JustSort js = new JustSort();
		Consumer<List<Integer>> c = e -> js.sort(e);
		c = js::sort;
		c.accept(ls);
		System.out.println(ls);
	}

}
class JustSort{
	public void sort(List<?> lst) {
		Collections.reverse(lst);
	}
}