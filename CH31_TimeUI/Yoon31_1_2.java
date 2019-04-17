package CH31_TimeUI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
public class Yoon31_1_2 {

	public static void main(String[] args) {
		// LocalTime class 시각을 표현하는데, 몇시 몇분 몇초 // 
		LocalTime now = LocalTime.now();
		System.out.println(now); // LocalTime <-Duration 
		// LocalDate <- Period
		System.out.println(now.plusHours(123));
		
		LocalTime start = LocalTime.of(14, 25, 35);
		LocalTime end = LocalTime.of(15, 45, 10);
		Duration between = Duration.between(start, end);
		System.out.println(between);
		
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);
		
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime flight1 = LocalDateTime.of(2019, 10,7,12,0);
		LocalDateTime flight2= LocalDateTime.of(2019, 10,7,11,12);
		
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2))
			myFlight = flight1;
		else
			myFlight = flight2;
		
		Period pd = Period.between(today.toLocalDate(), myFlight.toLocalDate());
		Duration d = Duration.between(today.toLocalTime(), myFlight.toLocalTime());
		System.out.println(pd+"\t"+d);
	}

}
