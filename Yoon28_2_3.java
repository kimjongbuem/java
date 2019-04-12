package CH28;

import java.util.Optional;
import java.util.function.Function;

public class Yoon28_2_3 {

	public static void main(String[] args) {
		Optional<String> os1 = Optional.of("Optional String");
		Optional<String> os2 = os1.map(s->s.toUpperCase());
		System.out.println(os2.get()); // Optional Ŭ������ �μ� ��ȯ�ϴ�... get�޼ҵ� ȣ��.
		
		Optional<String> os3 = os1.map(s-> s.replace(' ', '_')).map(s-> s.toLowerCase());
		System.out.println(os3.get());
		
		// orElse + empty ����ƽ �޼ҵ�.
		Optional<String > os4 = Optional.empty();
		Optional<String> os5 = Optional.of("Korea");
		
		String s1 = os4.map(new Function<String,String>(){
			public String apply(String s) {
				return s.toString();
		}}).orElse("empty");
		String s2 = os5.map(s -> s.toString()).orElse("empty");
		
		System.out.println(s1+"\t"+s2);
	}

}