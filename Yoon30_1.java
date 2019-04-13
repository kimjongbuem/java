package CH30_Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Yoon30_1 {

	public static void main(String[] args) {
		// ������� �÷����̳� ��ü�� �־��ִ°� �ƴ϶� �ٷ� ������ �־ ����ϴ� ��Ʈ�� //
		
		Stream.of(11,2,33,44,55)
		.forEach(i->System.out.print(i+"\t"));
		
		System.out.println();
		
		Stream.of("Hello World").
		forEach(s -> System.out.println(s));
		
		List<String> list = Arrays.asList("Toy", "Robot", "Box");
		Stream.of(list).forEach(li ->System.out.println(li)); // ��Ʈ���ȿ� list�� 
		list.stream().forEach(s ->System.out.println(s)); // ���⿡�� list�� �ν��Ͻ��� ��Ʈ��.
		// �ϳ��� ��Ʈ���ȿ� �ټ��� �÷��� �ν��Ͻ��� ���� �� �ִ� //
	}

}
