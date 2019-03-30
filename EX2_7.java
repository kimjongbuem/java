package test;

public class EX2_7 {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6}}; // 초기화
		PrintTranspos(arr);
	}
	
public static void PrintTranspos(int [][]aArr){
	System.out.println(aArr.length +" " +aArr[0].length);
	// 각 길이파악.
	int [][]bArr = new int[aArr[0].length][aArr.length]; // 행과 열 체인지~
	int aRow = aArr.length;
	int aCol = aArr[0].length;
	int bRow = 0, bCol = 0;
	for(int i=0;i<aRow;i++) {
		for(int j=0;j<aCol;j++) {
			bArr[bRow][bCol] = aArr[i][j];
			System.out.print(bArr[bRow][bCol]);
			bCol++;
			if(bCol>=bArr[0].length) {
				bRow++; bCol = 0;
				System.out.println();
			}
		}
	}
}
}

