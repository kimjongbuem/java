package test;
import java.util.Scanner;
public class EX_CH2_8 {
	// ������ // 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
			int value;
			while(true) {
				System.out.println("3�̻� Ȧ���� ����� �Է��ϼ��� : ");
				value = scan.nextInt();
				if(value % 2 == 1 && value >= 3) break;
				else System.out.println("�ٽ��Է��ϼ���");
			}
			PrintMabangZin(value);
	}
	public static void PrintMabangZin(int val) {

		int [][]arr = new int [val][val]; // Ȧ�� ���簢�� ������...
		int curRow = 0;
		int curCol = val/2;
		arr[curRow][curCol] = 1; // 1�� ��� ���� ���� 1�� ���´�.
		int count = 1; // �ش�  ������ count;
		while(count<val*val) { // ī��Ʈ�� 25�� �����ϋ����� �ݺ�.
			curRow -=1; curCol +=1;
			if(curRow < 0 && (curCol >=0 && curCol < val)) {
				curRow = val - 1;
				arr[curRow][curCol] = ++count; // curRow�� ������
			}
			else if(curRow >=0 && curCol >= val) {
				curCol = 0;
				arr[curRow][curCol] = ++count; // curCol�� ������
			}
			else if(curRow < 0 && curCol >= val) {// �Ѵ� ������..
				if(arr[val - 1][0] != 0) { //�ٸ����� �ִٸ�
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
				if(arr[curRow][curCol] != 0) { //�ٸ����� �ִٸ�
					curRow +=2;
					curCol-=1;
					arr[curRow][curCol] = ++count;
				}	
					else
					arr[curRow][curCol] = ++count; //�ٸ����� ���ٸ�
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
