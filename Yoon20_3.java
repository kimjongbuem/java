package test;

import java.util.StringTokenizer;

public class Yoon20_3 {

	public static void main(String[] args) {
		// ���ڿ� ��ū // 
		StringTokenizer st = new StringTokenizer("PM : 08:45 ",": ");
		// 2���� �޼ҵ� hasMoreTokens( )->��ȯ�� ��ū �����ֳ�? , String nextToken( ) -> ������ū��ȯ
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44","*^&+= ");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
