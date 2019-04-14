package CH31_TimeUI;

import java.time.ZoneId;
public class Yoon31_2_1 {

	public static void main(String[] args) {
		// ZonedDateTime>> LocalDateTime + �ð���(����) // 
		ZoneId paris = ZoneId.of("Europe/Paris"); // �ĸ��� �ð��� ���� �ݿ�.
		System.out.println(paris);
		ZoneId.getAvailableZoneIds().stream().filter(s-> s.startsWith("Asia")).sorted().forEach( s->System.out.println(s));
	}

}
