package CH28;
import java.util.*;
import java.util.function.Consumer;
public class Yoon28_1_2 {

	public static void main(String[] args) {
		// �ν��Ͻ� �޼ҵ� ���� 1 effectively final -> ��ǻ� �����.? ���α׷� ���� ������ �װ��谡 ����//
		List<Integer> ls = Arrays.asList(1,3,5,7,9);
		ls = new ArrayList<>(ls);
		JustSort js = new JustSort();
		Consumer<List<Integer>> c = e -> js.sort(e);
		c = js::sort; // �ƴ� �������� �ü��ֳ�?
		/*
		 * accept(List<Integer> e){
		 * js.sort(e); 
		 * } ������??
		 */
		c.accept(ls);
		System.out.println(ls);
		// js = null; ���α׷����� �ɶ����� js �����ϴ� ����� �ٲ���̱� ������ 
		////////////////////
		List<String> lis = Arrays.asList("Box","Toy", "Robot");
		lis.forEach(s -> System.out.println(s)); //���޵Ǵ� ���� �״�� ��������±���
		lis.forEach(System.out::println);
	}

}
class JustSort{
	public void sort(List<?> lst) {
		Collections.reverse(lst);
	}
}