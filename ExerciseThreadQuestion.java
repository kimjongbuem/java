package CH34_Thread;

import java.util.Scanner;

public class ExerciseThreadQuestion {

	public static void main(String[] args){
	ValueContainer con = new ValueContainer();
	Summer s = new Summer(con);
	s.start();
	Scanner scan = new Scanner(System.in);
	System.out.println("다섯개 정수 입력 :");
	for(int i = 0;i<5;i++) {
		con.setSum(scan.nextInt());
	}
	try {
		s.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}

}
}
class ValueContainer{
	int sum = 0;
	boolean check = false;
	ValueContainer(){
	
	}
	public void setSum(int val){
		synchronized(this) {
			if(check)
			{
				try {
						wait();
				}catch( InterruptedException e) {
					e.printStackTrace();
				}
			}
			sum = val;
			check = true;
			notify();
		}
	}
	public int getSum() {
		int retNum = 0;
		synchronized(this) {
			if(!check) {
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			retNum = sum;
			check = false;
			notify();
		}
		return retNum;
	}
}
class Summer extends Thread{
	ValueContainer con = new ValueContainer();
	int sum = 0;
	public Summer(ValueContainer con) {
		this.con = con;
	}
	public void run() {
		for(int i = 0;i<5;i++)
			sum+=con.getSum();
		System.out.println("합 : "+sum);
	}
}