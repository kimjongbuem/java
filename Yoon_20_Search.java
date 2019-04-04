package test;

import java.util.Arrays;

public class Yoon_20_Search {

	public static void main(String[] args) {
		int[] ar = {33,55,11,44,22};
		Arrays.sort(ar);
		for(int n : ar)
			System.out.print(n+"\t");
		System.out.println();
		int idx1 = makebinarySearch(ar,33);
		int idx2 = Arrays.binarySearch(ar, 33);
		
		System.out.println(idx1+"\t"+idx2);
		
	}
public static int makebinarySearch(int []a, int key) {
	// 정렬 // 
	Arrays.sort(a); // a를 오름차순 정렬
	int first = 0;
	int last= a.length - 1;
	int middle;
	while(first <= last) {
		middle = (first + last)/2;
		if(a[middle] > key)
			first = middle + 1;
		else if(a[middle] < key) 
			last = middle - 1;
		else if(a[middle] == key) 
			return middle;
	}
	return -1; // 못찾음./..
}
}
