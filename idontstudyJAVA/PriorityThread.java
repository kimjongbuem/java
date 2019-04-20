package idontstudyJAVA;

public class PriorityThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MessageSendingThread m1 = new  MessageSendingThread("first",Thread.MAX_PRIORITY);
		 MessageSendingThread m2 = new  MessageSendingThread("Seconds",Thread.NORM_PRIORITY);
		 MessageSendingThread m3 = new  MessageSendingThread("third",Thread.MIN_PRIORITY);
		 
		 m1.start();
		 m2.start();
		 m3.start();
		 System.out.println("mainThread end");
	}

}
class MessageSendingThread extends Thread{
	String message;
	public MessageSendingThread(String str, int prio) {
		message = str;
		setPriority(prio);
	}
	public void run() {
		for(int i =0;i<10;i++)
			System.out.println(message+getPriority());
	}
}