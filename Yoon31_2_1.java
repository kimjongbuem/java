package CH31_TimeUI;

import java.time.ZoneId;
public class Yoon31_2_1 {

	public static void main(String[] args) {
		// ZonedDateTime>> LocalDateTime + 시간대(시차) // 
		ZoneId paris = ZoneId.of("Europe/Paris"); // 파리의 시간대 정보 반영.
		System.out.println(paris);
		ZoneId.getAvailableZoneIds().stream().filter(s-> s.startsWith("Asia")).sorted().forEach( s->System.out.println(s));
	}

}
