package CH29_Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Yoon29_3 {

	public static void main(String[] args) {
		// �����ǰ� ���� ��Ʈ�� //
		// �������� �����͵��� �ϳ��� �����ͷ� ��ȯ�ϴ� ���·�.. ���ٽ����� ���� ���ϴ� ������ ���� �� reduce �޼ҵ� �������� //
		// reduce(T identity BinaryOperator<T> accumulator)
		// BinaryOperaotr �߻�޼ҵ� : T apply(T t1, T t2) 
		
		List<String> ls =Arrays.asList("Box","Complex","rrrrrrr","Robot");
		
		BinaryOperator<String> lc = (t1, t2) -> { // ���ٽ�.
			if(t1.length() > t2.length())
				return t1;
			else
				return t2;
		};
		System.out.println(ls.stream().reduce("what is that?",lc)); // ���� box �� complex �� �ؼ� ���ٽı��  -> complex��ȯ -> complex�� rrrrrrr�� ... �̷���.
		// ���ེ ù��° ���ڴ� �Ǿտ� ���� �߰��ǰ� ���� �����Ѵٰ� ������. //
		
		// ���Ľ�Ʈ�� -> ����ó���� ���� �۾��� ������ �����ϴ� ������ �־ ����������.. �ð��� �缭 �������ض�.//
		System.out.println(ls.parallelStream().reduce("",lc));
	}

}
