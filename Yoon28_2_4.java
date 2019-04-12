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
		// Optional�� ������ �ʴ´� �Ϳ�! ��ɹ�ȯ��.
		System.out.println(os3.get());
		
		//-----------------------------------------//
		
		Optional<TestContInfo> ciTest = Optional.of(new TestContInfo(Optional.ofNullable(null), 
				Optional.of("���ѹα� ��⵵ ������")));
		
		String phone = ciTest.flatMap(c -> c.getPhone()). // �ϴ� �ɼų� Ŭ���� ��ȯ
							  orElse("There is no...."); // �״��� ���빰�� �ִٸ�/���ٸ����� ����.
		
		String addr = ciTest.flatMap(c -> c.getAdrs()). // �ϴ� �ɼų� Ŭ���� ��ȯ
				  orElse("There is no...."); // �״��� ���빰�� �ִٸ�/���ٸ����� ����.
		
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