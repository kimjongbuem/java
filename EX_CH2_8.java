package test;
import java.util.Scanner;
public class EX_CH2_8 {
	// 마방진 // 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
			int value;
			while(true) {
				System.out.println("3이상 홀수인 양수를 입력하세요 : ");
				value = scan.nextInt();
				if(value % 2 == 1 && value >= 3) break;
				else System.out.println("다시입력하세요");
			}
			PrintMabangZin(value);
	}
	public static void PrintMabangZin(int val) {

		int [][]arr = new int [val][val]; // 홀수 정사각형 마방진...
		int curRow = 0;
		int curCol = val/2;
		arr[curRow][curCol] = 1; // 1행 가운뎃 열에 숫자 1을 놓는다.
		int count = 1; // 해당  마방진 count;
		while(count<val*val) { // 카운트가 25개 이하일떄까지 반복.
			curRow -=1; curCol +=1;
			if(curRow < 0 && (curCol >=0 && curCol < val)) {
				curRow = val - 1;
				arr[curRow][curCol] = ++count; // curRow만 밖으로
			}
			else if(curRow >=0 && curCol >= val) {
				curCol = 0;
				arr[curRow][curCol] = ++count; // curCol만 밖으로
			}
			else if(curRow < 0 && curCol >= val) {// 둘다 밖으로..
				if(arr[val - 1][0] != 0) { //다른값이 있다면
				curCol -= 1;
				curRow += 2;
				arr[curRow][curCol] = ++count; 
				}
				else {
					curRow = val -1;
					curCol = 0; 
					arr[curRow][curCol] = ++count;
				}
			}
			else {
				if(arr[curRow][curCol] != 0) { //다른값이 있다면
					curRow +=2;
					curCol-=1;
					arr[curRow][curCol] = ++count;
				}	
					else
					arr[curRow][curCol] = ++count; //다른값이 없다면
			}	
		}
		for(int i = 0; i< val;i++) {
			for(int j = 0; j < val; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
