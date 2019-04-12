package CH28;

import java.util.Optional;

public class Yoon28_2_2 {

	public static void main(String[] args) {
		Optional<String> os1 = Optional.of(new String("Toy1")); // ¿É¼Å³Î ½ºÅÂÆ½ ¸Þ¼Òµå
		Optional<String> os2 = Optional.ofNullable(new String("Toy2"));
		
		if(os1.isPresent())
			System.out.println(os1.get());
		if(os2.isPresent())
			System.out.println(os2.get());
		
		os2 = Optional.ofNullable(null);
		if(os2.isPresent())
			System.out.println(os2.get());
		else
			System.out.println("Not instance");
		
		os1.ifPresent(s -> System.out.println(s));
		os1.ifPresent(System.out::println);
	}

}
