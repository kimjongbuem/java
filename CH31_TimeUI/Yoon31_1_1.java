package CH31_TimeUI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Yoon31_1_1 {

	public static void main(String[] args) {
		// �ð�ȭ ! // 
		// �ð��� �󸶳� �ɸ�? //
		Instant start = Instant.now(); //���� �ð������� ����
		
		System.out.println("���� : " + start.getEpochSecond()); // 1970 01 01�κ��� ������ ���� �����½ð��� �ʷ� ������ش�!
		
		Instant end = Instant.now();
		System.out.println("why not?????????????????");
		for(int i = 0;i<10000;i+=2);
		System.out.println("�� : " +  Instant.now().getEpochSecond());
		Duration between = Duration.between(start, end); // �෹�̼��� �ð����� �� instant ������ ��
		System.out.println("�и� �� ���� �� : "+ between.toMillis()); //�и������������ �޼ҵ�
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.getYear());
		today = today.minusYears(1);
		LocalDate last = today.minusMonths(2);
		System.out.println(today.minusYears(1));
		
		Period left = Period.between(today, last); // ������ ������ �� 
		
		System.out.println(left.getMonths()+"��");
	}

}
