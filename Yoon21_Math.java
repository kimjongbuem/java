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
		/* scanner-> nextLine -> split " " �迭����� parseDouble..
		 * 
		 * 
		 * */
		Random rand = new Random(); // nextInt nextLong nextInt(Bound)
		/*
		 * ���⼭ ���� �����ڴ� pulbic Ramdom(){
		 *	this(System.currnetTimeMillis(); -> �Ϻ��� ������ �ƴϴ�. �õ尪�� ������... 
		 * }
		 **/
		for(int i = 0;i<7;i++)
			System.out.println(rand.nextInt(1000));
		System.out.println("\n");
		Random rndT = new Random(15);
		for(int i = 0;i<7;i++)
			System.out.println(rndT.nextInt(1000)); // �õ尪�� ������ ũ��� ���ع��� ��
		
	}

}
