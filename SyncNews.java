package CH34_Thread;

public class SyncNews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPaper paper = new NewsPaper();
		NewsReader reader1 = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);
		NewsReader reader2 = new NewsReader(paper);
		try {
			reader1.start();
			reader2.start();
			Thread.sleep(1000);
			writer.start();
			reader1.join();
			reader2.join();
			writer.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
class NewsPaper{
	String todayNews;
	boolean isTodayNews =false;
	public void setTodayNews(String news) {
		todayNews = news;
		isTodayNews = true;
		synchronized(this) {
			notifyAll(); // ����Ͼ!
		}
	}
	public String getTodayNews() {
		if(!isTodayNews) {
			try {
				synchronized(this) {
					wait(); // ��ٸ��ڴ�..
				}
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		return todayNews;
	}
}
class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		paper.setTodayNews("�ڹ��� ���Ⱑ �߰̽��ϴ�!");
	}
}
class NewsReader extends Thread{
	NewsPaper paper;
	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		System.out.println("������ ���� : "+paper.getTodayNews());
	}
}
