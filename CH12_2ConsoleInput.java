package CH12_ConSole_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CH12_2ConsoleInput {

	public static void main(String[] args) {
//		try {
//			InputStreamReader isr = new InputStreamReader(System.in);
//			BufferedReader br =new BufferedReader(isr);
//			System.out.print("정 수 입 력 :");
//			String str =br.readLine();
//			int num = Integer.parseInt(str);
//			System.out.println(num);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		String source = "1 2 3 4";
		Scanner sc = new Scanner(source);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(num1+num2+num3);
		
		sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.println(num1+num2+num3);
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println(str);
		boolean isTrue = sc.nextBoolean();
		if(isTrue)
			System.out.println("Hello");
	}

}
