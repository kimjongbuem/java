package CH30_Stream2;

import java.util.stream.IntStream;

public class Yoon30_3_1 {

	public static void main(String[] args) {
		// ���� ���� �� ������ : sum, count + Optional�� �μ� ��ȯ�ϴ� average, min, max//
		// forEach //
		// allMacth anyMatch noneMatch //
		boolean b = IntStream.of(1,2,3,4,5).allMatch(i -> i%2 == 0);
		System.out.println(b); // �ٸ����� Ʈ�� 
		
		b = IntStream.of(1,2,3,4,5).anyMatch(i -> i%2 == 0);
		System.out.println(b); // �ϳ��� ������ Ʈ�� 
		
		b = IntStream.of(1,2,3,4,5).noneMatch(i -> i%2 == 0);
		System.out.println(b); // �ϳ��� ���� �ʾƾ� Ʈ��
	}

}
