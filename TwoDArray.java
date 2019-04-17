package test;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1¹ø //
		int[][] arr = {
				{1,2},
				{1,2,3,4},
				{1,2,3,4,5}
		};
		int add = 10;
		addTwoDArr(arr,add);
		show(arr);
		System.out.println();
		// 2¹ø // 
		arr = new int[][] {
			{1,2,3,4},
			{4,5,6,7},
			{7,8,9,10},
			{11,12,13,14},
			{15,16,17,18},
			{19,20,21,22}
		};
		changeCol(arr);
		show(arr);
	}
	public static void addOneDArr(int []arr, int add) {
		for(int i = 0;i<arr.length;i++)
			arr[i] += add;
	}
public static void addTwoDArr(int [][]arr, int add) {
		for(int i =0;i<arr.length;i++)
			addOneDArr(arr[i],add);
	}
public static void show(int[][]arr) {
	for(int i =0;i<arr.length;i++) {
		for(int j =0;j<arr[i].length;j++)
			System.out.print(arr[i][j]+" ");
		System.out.println();
	}
}
public static void changeCol(int[][]arr) {
	int[]temp = new int[arr[0].length];
	for(int i=0;i<arr[0].length;i++)
		temp[i] = arr[0][i];
	
	for(int i = 0; i<arr.length - 1;i++)
		for(int j = 0; j<arr[i].length;j++)
			arr[i][j] = arr[i+1][j];
	
	for(int i = 0; i<arr[0].length;i++)
		arr[arr.length - 1][i] = temp[i];
	
}
}
