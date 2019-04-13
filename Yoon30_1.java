package CH30_Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Yoon30_1 {

	public static void main(String[] args) {
		// ������� �÷����̳� ��ü�� �־��ִ°� �ƴ϶� �ٷ� ������ �־ ����ϴ� ��Ʈ�� //
		// ��Ʈ�� ����� //
		Stream.of(11,2,33,44,55)
		.forEach(i->System.out.print(i+"\t"));
		
		System.out.println();
		
		Stream.of("Hello World").
		forEach(s -> System.out.println(s));
		
		List<String> list = Arrays.asList("CToy", "CCcRobot", "Boxss");
		Stream.of(list).forEach(li ->System.out.println(li)); // ��Ʈ���ȿ� list�� 
		list.stream().forEach(s ->System.out.println(s)); // ���⿡�� list�� �ν��Ͻ��� ��Ʈ��.
		// �ϳ��� ��Ʈ���ȿ� �ټ��� �÷��� �ν��Ͻ��� ���� �� �ִ� //
		
		Stream<String> ss = list.stream();
		String str = ss.parallel().reduce("", (s1, s2) -> {if(s1.length() > s2.length()) return s1; else return s2;}); //���Ľ�Ʈ�� ��ú�ȯ
		System.out.println(str);
		
		Stream<String> s1 = Stream.of("Cake" ,"Milk");
		Stream<String> s2 = Stream.of("Cake" ,"Milk","Kow");
		Stream.concat(s1, s2).forEach(s-> System.out.print(s+" ")); // Stream�� ���� ��������~
	}

}
