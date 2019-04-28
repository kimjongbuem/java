package CH30_Stream2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Yoon30_2_2 {

	public static void main(String[] args) {
		// ���� //
		Stream.of("Box","Apple","Robot Taegon V")
		.sorted().forEach(s->System.out.println(s));
		Stream.of(1,2,3,4,5).sorted().forEach(s->System.out.print(s));
		System.out.println();
		Stream.of("Box","Apple","Robot Taegon V").sorted((s1, s2) -> s2.length() - s1.length())
		.forEach(s ->System.out.println(s));
//		
		// ���� peek�� �߰����� forEach��  ��������// 
		IntStream.of(1,2,3,4,5).peek(d -> System.out.print(d+"\t")); //�߰������̶� ������������� ���� ������
		System.out.println(IntStream.of(1,2,3,4,5).peek(d -> System.out.print(d+"\t")).sum());
		
		IntStream.of(1,2,3,4,5,6).peek(a ->System.out.println(a)).sum();
	}
	
}
