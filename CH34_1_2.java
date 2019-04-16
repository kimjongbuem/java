package CH34_Thread;

public class CH34_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task1 = () ->{
			try {
				for(int i =0;i<20;i++) {
					if(i%2 == 0)
						System.out.print(i+" ");
					Thread.sleep(100);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		};
		Runnable task2 = () ->{
			try {
				for(int i =0;i<20;i++) {
					if(i%2 == 1)
						System.out.print(i+" ");
					Thread.sleep(100);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
	}

}
