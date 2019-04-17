package CH34_Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.*;
public class CH34_3_4 {
	public static List<Integer> lst = Collections.synchronizedList(new
			ArrayList<Integer>());
	public static void main(String[] args) throws InterruptedException {
		// 컬렉션 인스턴스 동기화 //
		for(int i = 0; i<16;i++)
			lst.add(i);
		
		System.out.println(lst);
		
		Runnable task = () ->{
//			ListIterator<Integer> itr = lst.listIterator();
//			while(itr.hasNext())
//				itr.set(itr.next() + 1);
			
			synchronized(lst) {
				ListIterator<Integer> itr = lst.listIterator();
				while(itr.hasNext())
					itr.set(itr.next() + 1);
			}
		};
		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(task); exr.submit(task); exr.submit(task);
		
		exr.shutdown();
		exr.awaitTermination(100, TimeUnit.SECONDS);
		System.out.println(lst);
	}

}