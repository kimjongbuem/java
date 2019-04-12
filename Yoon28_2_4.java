package CH28;

import java.util.Optional;
import java.util.OptionalInt;

public class Yoon28_2_4 {

	public static void main(String[] args) {
		// FlatMap method //
		Optional<String> os1 = Optional.of("Optional String");
		Optional<String> os2 = os1.map(s->s.toUpperCase());
		System.out.println(os2.get()); 

		Optional<String> os3 = os1.flatMap(s -> Optional.of(s.toLowerCase()));
		// Optional로 감싸지 않는다 와웅! 고냥반환함.
		System.out.println(os3.get());
		
		//-----------------------------------------//
		
		Optional<TestContInfo> ciTest = Optional.of(new TestContInfo(Optional.ofNullable(null), 
				Optional.of("대한민국 경기도 군포시")));
		
		String phone = ciTest.flatMap(c -> c.getPhone()). // 일단 옵셔널 클래스 반환
							  orElse("There is no...."); // 그다음 내용물이 있다면/없다면으로 담음.
		
		String addr = ciTest.flatMap(c -> c.getAdrs()). // 일단 옵셔널 클래스 반환
				  orElse("There is no...."); // 그다음 내용물이 있다면/없다면으로 담음.
		
		System.out.println(phone+'\n'+addr);
		
		//-----------------------------------------//
		OptionalInt oi1 = OptionalInt.of(3);
		oi1.ifPresent(i -> System.out.println(i));
		Integer i = new Integer(3);
	}

}
class TestContInfo{
	Optional<String> phone;
	Optional<String> adrs;
	public TestContInfo(Optional<String> p, Optional<String> adr) {
		phone = p; adrs = adr;
	}
	public Optional<String> getPhone() {return phone;}
	public Optional<String> getAdrs() {return adrs;}
}