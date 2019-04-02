package javaEX;
import java.util.Scanner;
public class ExerciseCh3_10_5 {

	public static void main(String[] args) {
		//사람의 키와 몸무게를 입력받아 비만도를 계산하는 프로그램 //
		Scanner sc = new Scanner(System.in);
		System.out.println("키랑 몸무게를 입력해 주세요");
		String inputs = sc.nextLine();
		String[] array = inputs.split(" ");
		double []val = new double[3];
		for(int i=0; i < 2; i++) {
			val[i] = Double.parseDouble(array[i]);
		}
		printOverWeight(val[0],val[1]);
	}
	public static void printOverWeight(double h, double w) {
		double sw = (h - 100)*0.9;
		double B = w/sw*100;
		System.out.println("비만도 = "+ B);
	}
}
