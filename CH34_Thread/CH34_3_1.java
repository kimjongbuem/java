package CH34_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CH34_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () ->{
			int n1 =10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name+":"+(n1+n2));
		};
		
		ExecutorService exr = Executors.newSingleThreadExecutor();
		exr.submit(task); // 작업끝나면 돌아간다. 
		exr.shutdown();
	}

}
