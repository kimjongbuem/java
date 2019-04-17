package CH34_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class CH34_3_3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Callable<Integer> task = ()->{
			int sum = 0;
			for(int i = 1;i<10;i++)
				sum+=i;
			return sum;
		};
		ExecutorService exr = Executors.newFixedThreadPool(2);
		
		
		Future<Integer> fur = exr.submit(task);
		Integer i = fur.get();
		System.out.println(i);
		exr.shutdown();
	}

}
