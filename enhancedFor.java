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
		// int [][]arr2 = new int[3][4]; // 2�����迭 ��
		int [][]arr3 = { // �ʱ�ȭ�� �̷����ϸ� c, c++ó�� 0���� �ʱ�ȭ �����ʴ´�...
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
