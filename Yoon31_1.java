package CH31;

import java.time.Duration;
import java.time.Instant;

public class Yoon31_1 {

	public static void main(String[] args) {
		// �ð�ȭ ! // 
		// �ð��� �󸶳� �ɸ�? //
		Instant start = Instant.now(); //���� �ð������� ����
		
		System.out.println("���� : " + start.getEpochSecond());
		
		Instant end = Instant.now();
		System.out.println("why not?????????????????");
		for(int i = 0;i<10000;i+=2);
		System.out.println("�� : " +  Instant.now().getEpochSecond());
		Duration between = Duration.between(start, end); // �෹�̼��� �ð����� 
		System.out.println("�и� �� ���� �� : "+ between.toMillis());
	}

}
