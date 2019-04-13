package CH30_Stream2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Yoon30_2_2 {

	public static void main(String[] args) {
		// ���� //
		Stream.of("Box","Apple","Robot Taegon V")
		.sorted().forEach(s->System.out.println(s));
		
		Stream.of("Box","Apple","Robot Taegon V").sorted((s1, s2) -> s2.length() - s1.length())
		.forEach(s ->System.out.println(s));
		
		// ���� peek�� �߰����� forEach��  ��������// 
		IntStream.of(1,2,3,4,5).peek(d -> System.out.print(d+"\t")); //�߰������̶� ������������� ���� ������
		System.out.println(IntStream.of(1,2,3,4,5).peek(d -> System.out.print(d+"\t")).sum());
	}

}
