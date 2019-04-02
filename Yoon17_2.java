package test;

public class Yoon17_2 {

	public static void main(String[] args) {
		Report report = new Report("fgdREprot");
		Printables a = new Report("Hhello");
		// Printables b = new Printables();
		report.printContents(a);
	}

}
interface Upper {}
interface Lower {}
interface Printables{
	String getContents();
}
class Report implements Printables, Lower{
	String cons;
	
	Report(String cons){
		this.cons =cons;
	}
	@Override
	public String getContents() {
		return cons;
	}
	public void printContents(Printables doc) {
		if(doc instanceof Upper) {
			System.out.println((doc.getContents().toUpperCase()));
		}
		else if(doc instanceof Lower) {
			System.out.println((doc.getContents().toLowerCase()));
		}
		else{
			System.out.println(doc.getContents());
		}
	}

}