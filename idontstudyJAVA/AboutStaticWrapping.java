package idontstudyJAVA;
import java.math.*;
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
		
		System.out.println("");
	}
}
