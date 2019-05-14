package test;

public class Consumer extends Thread {
	private CircularQueue boundBuffer;
	private int number;
	public Consumer(CircularQueue c, int number) {
		super("Consumer#"+number);
		boundBuffer = c;
		this.number = number;
	}
	public void run() {
			int value = 0;
		for(int i = 0; i<10;i++) {
			value = boundBuffer.get();
			System.out.println(getName() + " get: " + value);
		}
	}
}
