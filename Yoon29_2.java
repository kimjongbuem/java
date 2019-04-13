package CH29_Stream1;

import java.util.Arrays;
import java.util.List;

public class Yoon29_2 {

	public static void main(String[] args) {
		// ��ǥ�� �߰� ���� ���͸��� ���� //
		/* ���͸�
		 * ���ٽ����� �������� �ش� �����͸� �ɷ�����! filter!
		 * 
		 * ���� 
		 * �� �ν��Ͻ��� ��ȣ�� �����Ѵ�.. 
		 * �̱浿 1��
		 * �赿�� 2��
		 * �ѵ���	3��
		 * 
		 * ���� ������ height��� �������� ���� ����.
		 * ������ ���ٽ��� �������� �������� ���� �ٲ��.
		 * �� ������ �����͸� �ٲ۴�! Change!
		 */
		// filtering //
		List<String> list = Arrays.asList("TOY", "Robot","Carfffff");
		list.stream().filter(s -> s.length() == 3).forEach(s->System.out.print(s+"\t"));
		System.out.println();
		//Maping//
		list.stream().mapToInt(s -> s.length()/2).forEach(s->System.out.print(s+"\t")); // �ڽ̾�ڽ� ���ҷ� //
	}

}
