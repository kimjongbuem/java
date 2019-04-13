package CH30_Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Yoon30_1 {

	public static void main(String[] args) {
		// 만들어잔 컬렉션이나 객체를 넣어주는게 아니라 바로 데이터 넣어서 사용하는 스트림 //
		
		Stream.of(11,2,33,44,55)
		.forEach(i->System.out.print(i+"\t"));
		
		System.out.println();
		
		Stream.of("Hello World").
		forEach(s -> System.out.println(s));
		
		List<String> list = Arrays.asList("Toy", "Robot", "Box");
		Stream.of(list).forEach(li ->System.out.println(li)); // 스트림안에 list가 
		list.stream().forEach(s ->System.out.println(s)); // 여기에는 list의 인스턴스가 스트림.
		// 하나의 스트림안에 다수의 컬렉션 인스턴스를 담을 수 있다 //
	}

}
