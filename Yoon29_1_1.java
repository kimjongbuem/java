
package CH29_Stream1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Yoon29_1_1 {

	public static void main(String[] args) {
		// ��Ʈ���� ���� //
		int []ar = {1,2,3,4,5};
		// ��Ʈ�� ��Ʈ���� ��Ʈ�� �迭�� ��Ʈ�� ���� �� �� �ڷ����� ���� //
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter(n -> n%2== 1);
		System.out.println(stm2.sum());
		
		// ���� ��Ʈ�� //
		System.out.println(Arrays.stream(ar).filter(n->n%2 == 1).sum()); // ��������
	}

}
