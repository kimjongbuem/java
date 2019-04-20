package idontstudyJAVA;

public class SyncronizedThread {

	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();
		NewsReader reader = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);

		reader.start();
		writer.start();
		try {
			reader.join();
			writer.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
class NewsPaper{
	String todayNews;
	
	public void setTodayNews(String news) {
		todayNews =news;
	}
	public String getTodayNews() {
		return todayNews;
	}
}
class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		paper.setTodayNews("�ڹ� ������ ����");
	}
}
class NewsReader extends Thread{
	NewsPaper paper = null;
	
	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		System.out.println("������ ����"+paper.getTodayNews());
	}
}