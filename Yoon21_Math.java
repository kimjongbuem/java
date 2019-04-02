package test;
import java.math.*;
import java.util.Random;
public class Yoon21_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.log(25));
		System.out.println(Math.pow(2, 16));
		/* scanner-> nextLine -> split " " 배열에담고 parseDouble..
		 * 
		 * 
		 * */
		Random rand = new Random(); // nextInt nextLong nextInt(Bound)
		/*
		 * 여기서 랜덤 생성자는 pulbic Ramdom(){
		 *	this(System.currnetTimeMillis(); -> 완벽한 난수는 아니다. 시드값을 가지니... 
		 * }
		 **/
		for(int i = 0;i<7;i++)
			System.out.println(rand.nextInt(1000));
		System.out.println("\n");
		Random rndT = new Random(15);
		for(int i = 0;i<7;i++)
			System.out.println(rndT.nextInt(1000)); // 시드값을 고정된 크기로 정해버렷 ㅠ
		
	}

}
