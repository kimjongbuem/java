package CH34_Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CH34_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task1 = () ->{
			String name = Thread.currentThread().getName();
			System.out.println(name+12);
		};
		Runnable task2 = () ->{
			String name = Thread.currentThread().getName();
			System.out.println(name+8);
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(task1);
		exr.submit(task2);
		exr.submit(()->{
			String name = Thread.currentThread().getName();
			System.out.println(name + 100);
		});
		exr.shutdown();
	}

}
