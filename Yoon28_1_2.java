package CH28;
import java.util.*;
import java.util.function.Consumer;
public class Yoon28_1_2 {

	public static void main(String[] args) {
		// 인스턴스 메소드 참조 1 effectively final -> 사실상 상수다.? 프로그램 종료 때까지 그관계가 유지//
		List<Integer> ls = Arrays.asList(1,3,5,7,9);
		ls = new ArrayList<>(ls);
		JustSort js = new JustSort();
		Consumer<List<Integer>> c = e -> js.sort(e);
		c = js::sort; // 아니 참조변수 올수있냐?
		/*
		 * accept(List<Integer> e){
		 * js.sort(e); 
		 * } 가능해??
		 */
		c.accept(ls);
		System.out.println(ls);
		// js = null; 프로그램종료 될때까지 js 참조하는 대상이 바뀐것이기 때문에 
		////////////////////
		List<String> lis = Arrays.asList("Box","Toy", "Robot");
		lis.forEach(s -> System.out.println(s)); //전달되는 인자 그대로 흘려보내는구나
		lis.forEach(System.out::println);
	}

}
class JustSort{
	public void sort(List<?> lst) {
		Collections.reverse(lst);
	}
}