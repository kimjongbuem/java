package idontstudyJAVA;
import java.math.*;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
public class AboutStaticWrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer value1  = Integer.valueOf(100);
		Integer value2 =  Integer.valueOf(100);//new Integer(100);
		if(value1 == value2)
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");
		BigInteger bigVal1 = new BigInteger("10000000000000");
		BigInteger bigVal2 = new BigInteger("-9999999999999");
		BigInteger addResult = bigVal1.add( bigVal2);
		BigInteger mulResult = bigVal2.multiply(bigVal1);
		System.out.println(addResult);
		System.out.println(mulResult);
		double e3 = 1.6;
		double e4 = 0.1;
		BigDecimal e1 = new BigDecimal("1.6");
		BigDecimal e2 = new BigDecimal("0.1");
		System.out.println(e1.multiply(e2)); // 오차 ㄴㄴ
		System.out.println(e3*e4); // 오차 @
		Random rand = new Random();
		Scanner sc =new Scanner(System.in);
		System.out.println("정수 2개 입력 :");
		int data1 = sc.nextInt(); int data2 = sc.nextInt(); // data1 > data2
		int val; double d;
		for(int i = 0;i<10;i++) {
			val = rand.nextInt(data1-data2) + data2;
			 System.out.print(val+"\t");
			 d= Math.random();
			 System.out.print(d+"\t");
		}
		String strData = "11:22:33:44:55";
		
		StringTokenizer st = new StringTokenizer(strData,":");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
