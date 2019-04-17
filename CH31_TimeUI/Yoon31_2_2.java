package CH31_TimeUI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class Yoon31_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime here = ZonedDateTime.now();
		System.out.println(here);
		
		ZonedDateTime paris = ZonedDateTime.of(here.toLocalDate(), here.toLocalTime(),ZoneId.of("Europe/Paris"));
		System.out.println(paris);
		
		Duration diff = Duration.between(here, paris);
		System.out.println(diff);
		ZonedDateTime date = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Seoul"));
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-M-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-MM-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-MM-d, HH:mm:ss VV");
		
		System.out.println(date.format(fm1));
		System.out.println(date.format(fm2));
		System.out.println(date.format(fm3));
	}

}
