package test;

public class Exercise4_8_9 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int k = i;k<10;k++)
				System.out.print(" ");
			for(int j=i;j>0;j--) {
				//¿Þ
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				//¿À
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
