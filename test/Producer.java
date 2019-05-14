package test;

public class Producer extends Thread {
	private CircularQueue boundBuffer;
	private int number;
	public Producer(CircularQueue c, int number) {
		super("Producer#"+number);
		boundBuffer = c;
		this.number = number;
	}
	public void run() {
		for(int i = 0; i<10;i++) {
			boundBuffer.put(i);
			System.out.println(getName() + " put: " + i);
			//try {
			//	sleep((int)(Math.random()* 100));
			//}catch(InterruptedException e) {}
		}
	}
}
