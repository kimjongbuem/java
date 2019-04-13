package CH30_Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Yoon30_1 {

	public static void main(String[] args) {
		// 만들어잔 컬렉션이나 객체를 넣어주는게 아니라 바로 데이터 넣어서 사용하는 스트림 //
		// 스트림 연산들 //
		Stream.of(11,2,33,44,55)
		.forEach(i->System.out.print(i+"\t"));
		
		System.out.println();
		
		Stream.of("Hello World").
		forEach(s -> System.out.println(s));
		
		List<String> list = Arrays.asList("CToy", "CCcRobot", "Boxss");
		Stream.of(list).forEach(li ->System.out.println(li)); // 스트림안에 list가 
		list.stream().forEach(s ->System.out.println(s)); // 여기에는 list의 인스턴스가 스트림.
		// 하나의 스트림안에 다수의 컬렉션 인스턴스를 담을 수 있다 //
		
		Stream<String> ss = list.stream();
		String str = ss.parallel().reduce("", (s1, s2) -> {if(s1.length() > s2.length()) return s1; else return s2;}); //병렬스트림 즉시변환
		System.out.println(str);
		
		Stream<String> s1 = Stream.of("Cake" ,"Milk");
		Stream<String> s2 = Stream.of("Cake" ,"Milk","Kow");
		Stream.concat(s1, s2).forEach(s-> System.out.print(s+" ")); // Stream들 끼리 연결하자~
	}

}
