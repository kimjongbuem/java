package CH34_Thread;

public class CH34_2_1 {
public static Counter counter = new Counter();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable task1= ()->{
			for(int i=0;i<1000;i++)
			counter.increment();
		};
		Runnable task2= ()->{
			for(int i=0;i<1000;i++)
				counter.decrement();
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();

		t1.join();
		t2.start();
		t2.join();
		System.out.println(counter.getCount());
	}

}
class Counter{
	int cnt = 0;
	public void increment() {
		cnt++;
	}
	public void decrement() {
		cnt--;
	}
	public int getCount() {return cnt;}
}