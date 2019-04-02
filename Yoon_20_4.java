package test;

import java.util.Arrays;

public class Yoon_20_4 {

	public static void main(String[] args) {
		// 복제 copyOf copyOfRange 복사 arrayCopyㅎㅎ 뭔소리냐먼 
		// copyof메소드는  새로운 배열을 만들어야하고 arrayCopy는 배열 안만들고 값 복사할 배열이 존재해야함.
		double []arOrg = {1.1,2.2,3.3,4.4,6.6};
		double []arCpy1 = Arrays.copyOf(arOrg, arOrg.length); // Array.equals method 
		System.out.println(Arrays.equals(arOrg,arCpy1)); // 얘는 public static boolean 으로 이루어짐 인스턴스비교아님
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
		System.arraycopy(org, 1, cpy, 0, 3);// 2번째 매개변수는 복사하는 배열의 인덱스 위치 그리고 그 위치이상 쭉 복사
		// 4, 5 매개변수는 복사될 배열의 인덱스위치 에서 5번 매개변수는 요소개수를 복사한다라는 의미.
		for(double d : cpy) {
			System.out.println(d+"\t");
		}
	}

}
