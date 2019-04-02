package test;

import java.util.StringTokenizer;

public class Yoon20_3 {

	public static void main(String[] args) {
		// 문자열 토큰 // 
		StringTokenizer st = new StringTokenizer("PM : 08:45 ",": ");
		// 2개의 메소드 hasMoreTokens( )->반환할 토큰 남아있냐? , String nextToken( ) -> 다음토큰반환
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44","*^&+= ");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
