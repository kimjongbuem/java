package CH31_TimeUI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Yoon31_1_1 {

	public static void main(String[] args) {
		// 시각화 ! // 
		// 시간이 얼마나 걸림? //
		Instant start = Instant.now(); //현재 시간정보를 담음
		
		System.out.println("시작 : " + start.getEpochSecond()); // 1970 01 01로부터 현재의 까지 지나온시간을 초로 계산해준다!
		
		Instant end = Instant.now();
		System.out.println("why not?????????????????");
		for(int i = 0;i<10000;i+=2);
		System.out.println("끝 : " +  Instant.now().getEpochSecond());
		Duration between = Duration.between(start, end); // 듀레이션은 시간정보 두 instant 변수의 차
		System.out.println("밀리 초 단위 차 : "+ between.toMillis()); //밀리세컨드얻어오는 메소드
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.getYear());
		today = today.minusYears(1);
		LocalDate last = today.minusMonths(2);
		System.out.println(today.minusYears(1));
		
		Period left = Period.between(today, last); // 도로컬 변수의 차 
		
		System.out.println(left.getMonths()+"월");
	}

}
