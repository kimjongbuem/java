package CH27;
import java.util.*;
import java.util.function.Predicate;
public class Yoon27_1_3 {

	public static void main(String[] args) {
		int sum;
		List<Integer> list = Arrays.asList(1,5,7,9,4,2,11,12);
		list = new ArrayList<>(list);
		sum = sum_List(n -> n%2==0, list);
		sum = sum_List(n-> n%2 != 0, list);
		System.out.println(sum);

	}
	public static int sum_List(Predicate<Integer>p, List<Integer> lst) {
		int sum = 0;
		for(int n : lst) {
			if(p.test(n))
				sum+=n;
		}
		
		
		return sum;
	}
}
