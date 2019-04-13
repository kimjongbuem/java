
package CH29_Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Yoon29_1 {

	public static void main(String[] args) {
		// ��Ʈ���� ���� //
		int []ar = {1,2,3,4,5};
		// ��Ʈ�� ��Ʈ���� ��Ʈ�� �迭�� ��Ʈ�� ���� �� �� �ڷ����� ���� //
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter(n -> n%2== 1);
		System.out.println(stm2.sum());
		
		// ���� ��Ʈ�� //
		System.out.println(Arrays.stream(ar).filter(n->n%2 == 1).sum()); // ��������
		// ��Ʈ�� ���� �߰������� �ϰ� �� �߰������� �� ��Ʈ���� ���������� �����Ѵٶ�� ���������� //
		
		String[] names = {"Yonon", "Meclo", "RanmDa"};
		Arrays.stream(names).forEach(s->System.out.println(s)); // foreach�� ��������
		//String ����� �� �ſ������ϴ�.
		
		List<String> list = Arrays.asList("Toy","RObot");
		list.stream().forEach(s->System.out.println(s));
	}

}
