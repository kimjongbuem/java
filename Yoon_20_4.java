package test;

import java.util.Arrays;

public class Yoon_20_4 {

	public static void main(String[] args) {
		// ���� copyOf copyOfRange ���� arrayCopy���� ���Ҹ��ĸ� 
		// copyof�޼ҵ��  ���ο� �迭�� �������ϰ� arrayCopy�� �迭 �ȸ���� �� ������ �迭�� �����ؾ���.
		double []arOrg = {1.1,2.2,3.3,4.4,6.6};
		double []arCpy1 = Arrays.copyOf(arOrg, arOrg.length); // Array.equals method 
		System.out.println(Arrays.equals(arOrg,arCpy1)); // ��� public static boolean ���� �̷���� �ν��Ͻ��񱳾ƴ�
		double []arCpy2 = Arrays.copyOf(arOrg,2);
		
		for(double d : arCpy1) {
			System.out.println(d+"\t");
		}
		for(double d : arCpy2) {
			System.out.println(d+"\t");
		}
		System.out.println();
		// array copy
		int [ ]org = {1,2,4,3,5};
		int []cpy = new int[3];
		System.arraycopy(org, 1, cpy, 0, 3);// 2��° �Ű������� �����ϴ� �迭�� �ε��� ��ġ �׸��� �� ��ġ�̻� �� ����
		// 4, 5 �Ű������� ����� �迭�� �ε�����ġ ���� 5�� �Ű������� ��Ұ����� �����Ѵٶ�� �ǹ�.
		for(double d : cpy) {
			System.out.println(d+"\t");
		}
	}

}
