package test;

public class enhancedFor {

	public static void main(String[] args) {
//		int[] ar= {1,2,3,4,5};
//		int sum = 0;
//		for(int i : ar)
//		{
//			System.out.println(i);
//			sum+=i;
//		}
//		System.out.println(sum);
		// int [][]arr2 = new int[3][4]; // 2차원배열 ㅋ
		int [][]arr3 = { // 초기화를 이렇게하면 c, c++처럼 0으로 초기화 되지않는다...
				{11},
				{22,33},
				{44,55,66}
		}; 
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
