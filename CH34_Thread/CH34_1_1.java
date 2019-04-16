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
		
		/*
		 * Runnable 인터페이스 구현 : run 메소드
		 * Thread의 생성 위의 인터페이스를 생성자의 인자로 전달하고 쓰레드 인스턴스 생성.
		 * 그리고 쓰레드 시작
		 */
	}

}
