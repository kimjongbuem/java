package test;

public class Exercise4_8_7 {

	public static void main(String[] args) {
		int sum = 0;
		int tempVal = 1;
		for(int i=0;i<10;i++) {
			for(int j=1;j<= i+1;j++) {
				tempVal *=j;
			}
			sum +=tempVal;
			tempVal = 1;
		}
		System.out.println("sum : "+sum);

	}

}
