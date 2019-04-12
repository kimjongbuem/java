package CH28;

import java.util.Optional;

public class Yoon28_2_2 {

	public static void main(String[] args) {
		Optional<String> os1 = Optional.of(new String("Toy1")); // ����Ŭ����, �ɼų� ����ƽ �޼ҵ�
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
		os1.ifPresent(System.out::println); // �޼ҵ� ���� ����
		
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
			addr = "There is no address"; // �� �̰� null���� ���� ���̸� �����ڳ�.... 28_2_3 ����
		
		// �ܼ�ȭ //
		Optional<ContInfo> csi =
				Optional.of(new ContInfo(null, "Republic of Korea"));
		phone = csi.map(c -> c.getPhone()).orElse("There is no phone Number");
		// orElse�� �־�� �ϴ� �ʿ����� Optional �Ȱ��Ѵ�.
		addr = csi.map(c -> c.getAdrs()).orElse("There is no Address");
		
		System.out.println(phone+"\t"+addr);
		
	}
}
