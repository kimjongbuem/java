package CH34_Thread;

public class CH34_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task1 = () ->{
			try {
				for(int i =0;i<20;i++) {
					if(i%2 == 0)
						System.out.print(i+" ");
					Thread.sleep(100);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		};
		Runnable task2 = () ->{
			try {
				for(int i =0;i<20;i++) {
					if(i%2 == 1)
						System.out.print(i+" ");
					Thread.sleep(100);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		Task t3 = new Task();
		t3.start();
		Task t4 = new Task();
		t4.start();
	}
}
// 쓰레드를 상속받아 클래스 정의 //
class Task extends Thread{
	public void run() {
		int n1 = 10;
		int n2 = 20;
		String name = Thread.currentThread().getName();
		System.out.println(name + ": "+(n1+n2));
	}
}

