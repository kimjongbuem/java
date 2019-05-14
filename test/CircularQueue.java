package test;

public class CircularQueue {
	private int content[], size;
	private int head, tail;
	private int count;
	
	public CircularQueue(int sz) {
		size = sz;
		content = new int[size];
		head = tail = 0;
		count = 0;
	}
	public synchronized int get() {
		int res;
		while(count == 0) 
			try {
				wait();
			}catch(InterruptedException e) {
			}
		res = content[tail];
		tail = (tail + 1 )% size;
		count--;
		notifyAll();
		return res;
	}
	public synchronized void put(int value) {
		while(size==count)try {
			wait();
		}catch(InterruptedException e) {
		}
		content[head] = value;
		head = (head + 1)% size;
		count++;
		notifyAll();
	}
}
