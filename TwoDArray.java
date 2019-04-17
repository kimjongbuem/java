package test;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2},
				{1,2,3,4},
				{1,2,3,4,5}
		};
		int add = 10;
		addTwoDArr(arr,add);
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
}
