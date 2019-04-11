package CH27;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Yoon27_1_3 {

	public static void main(String[] args) {
		int sum;
		List<Integer> list = Arrays.asList(1,5,7,9,4,2,11,12);
		list = new ArrayList<>(list);
		sum = sum_List(n -> n%2==0, list);
		sum = sum_List(n-> n%2 != 0, list);
		System.out.println(sum);
//		Supplier<Integer>supplier = () -> {
//			Random rand = new Random();
//			return rand.nextInt(50);
//		};
		list = makeIntList(() -> {
			Random rand = new Random();
			return rand.nextInt(50);
		}, 10);
		System.out.println(list);
		
		Consumer<String> c = s-> System.out.println(s);
		c.accept("Hi Hello");
		ObjIntConsumer<String> objInts = (T, value) -> System.out.println(value+"\t"+T);
		objInts.accept("<php>", 123);
	}
	public static int sum_List(IntPredicate p, List<Integer> list) {
		int sum = 0;
		for(int n : list) {
			if(p.test(n))
				sum+=n;
		}
		return sum;  // 오토박싱 언박싱 과정 없다. 빠르다 권고사항임
	}
	public static List<Integer> makeIntList(IntSupplier s, int n){
		List<Integer> list = new LinkedList<>();
		for(int i = 0;i<n;i++) {
			list.add(s.getAsInt());
		}
		return list;
	}
//	public static List<Integer> makeIntList(Supplier<Integer> s, int n){
//		List<Integer> list = new LinkedList<>();
//		for(int i = 0;i<n;i++) {
//			list.add(s.get());
//		}
//		return list;
//	}
	//public static int sum_List(BiPredicate p, List<Integer> list)
//	public static int sum_List(Predicate<Integer>p, List<Integer> lst) {
//		int sum = 0;
//		for(int n : lst) {
//			if(p.test(n))
//				sum+=n;
//		}
//		
//		
//		return sum;
//	}
}
