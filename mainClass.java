package test;
import java.util.Scanner;
import test.Box;
public class mainClass {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);
		// ��� Ŭ������ toString �޼ҵ带 ������ Ŭ���� ��ü ȣ���ϸ� toString������ �޼ҵ尡 ȣ��ȴ�.
		Box box = new Box("Camera");
		System.out.println(box.toString() + box);
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int sum = num1+ num2 + num3;
//		System.out.println(sum);
		sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int sum = num1+ num2 + num3;
//		System.out.println(sum);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(str1+str2);
	}

}
