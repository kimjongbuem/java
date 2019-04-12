package CH28;

import java.util.Optional;

public class Yoon28_2_2 {

	public static void main(String[] args) {
		Optional<String> os1 = Optional.of(new String("Toy1")); // 래퍼클래스, 옵셔널 스태틱 메소드
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
		
		os1.ifPresent(s -> System.out.println(s)); // 
		os1.ifPresent(System.out::println); // 메소드 참조 버전
		
		ContInfo ci = new ContInfo(null, "Republic of Korea");
		String phone;
		String addr;
		if(ci.phone != null)
			phone = ci.getPhone();
		else
			phone = "There is no phone number";
		
		if(ci.adrs != null)
			addr = ci.getAdrs();
		else
			addr = "There is no address"; // 야 이거 null마다 조건 붙이면 오바자나.... 28_2_3 으로
	}

}
