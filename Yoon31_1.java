package CH31;

import java.time.Duration;
import java.time.Instant;

public class Yoon31_1 {

	public static void main(String[] args) {
		// 시각화 ! // 
		// 시간이 얼마나 걸림? //
		Instant start = Instant.now(); //현재 시간정보를 담음
		
		System.out.println("시작 : " + start.getEpochSecond());
		
		Instant end = Instant.now();
		System.out.println("why not?????????????????");
		for(int i = 0;i<10000;i+=2);
		System.out.println("끝 : " +  Instant.now().getEpochSecond());
		Duration between = Duration.between(start, end); // 듀레이션은 시간정보 
		System.out.println("밀리 초 단위 차 : "+ between.toMillis());
	}

}
