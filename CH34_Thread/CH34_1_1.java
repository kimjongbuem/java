package CH34_Thread;

public class CH34_1_1 {

	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println("hello World");
		};
		Thread t = new Thread();
		t.start();
		String s = t.getName();
		System.out.println(s);
		
		Thread cur = Thread.currentThread();
		String ss = cur.getName();
		System.out.println(ss);
	}

}
