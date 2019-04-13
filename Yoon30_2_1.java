package CH30_Stream2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Yoon30_2_1 {

	public static void main(String[] args) {
		// 스트림의 중간 연산 1 : 1 map vs 1 : * flatMap //
		
		Stream<String> ss1 = Stream.of("MY_AGE","YOUR_LIFE");
		Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_"))); // flapMap은 반환형이 무조건 Stream 이여야한다.
		ss2.forEach(s -> System.out.print(s + "\t"));
		System.out.println("\n");
		ReportCard[] cards = {
				new ReportCard(80,80,80),
				new ReportCard(90,80,70),
				new ReportCard(100,80,60)
		};
		Stream<ReportCard> stm = Arrays.stream(cards);
		IntStream si = stm.flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()));
		double avg = si.average().getAsDouble();
		System.out.println(avg);
	}

}

class ReportCard{
	private int kor;
	private int eng;
	private int math;
	
public ReportCard(int k, int e, int m) {
	kor = k;
	eng = e;
	math = m;
}
public int getKor() { return kor; }
public int getEng() { return eng; }
public int getMath() { return math; }
}