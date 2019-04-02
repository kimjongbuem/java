package test;
import java.util.*;
import java.math.BigInteger;
import java.lang.reflect.Array;
import java.math.*;

public class EXbigIntegerAndDecimal {

	public static void main(String[] args) {
		// BigInteger
		BigInteger big = new BigInteger("135");
		System.out.println(big);
		BigInteger anotherBig = big.add(BigInteger.valueOf(100));
		System.out.println(anotherBig);
		BigInteger theOtherBig  = big.add(big);
		System.out.println(theOtherBig);
		BigDecimal b1 = new BigDecimal("1.03313");
		BigDecimal b2 = new BigDecimal("0.42222");
		System.out.println(b1.add(b2));
		System.out.println(b1.add(new BigDecimal("0.001")));
		System.out.println(b1.add(BigDecimal.valueOf(100)));
		// array sort //
	}

}
