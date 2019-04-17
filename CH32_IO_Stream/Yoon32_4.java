package CH32_IO_Stream;
import java.io.*;
public class Yoon32_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxing b1 = new Boxing("Robot");
		Boxing b2 = new Boxing("Monster");
		try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("data3.txt"))) {
			oo.writeObject(b1);
			oo.writeObject(b2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream oo = new ObjectInputStream(new FileInputStream("data3.txt"))) {
			Boxing temp;
				temp = (Boxing)oo.readObject();
				System.out.println(temp.toString());
				temp = (Boxing)oo.readObject();
				System.out.println(temp.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
class Boxing implements java.io.Serializable{
	String s;
	public Boxing(String s) {this.s = s;}
	public String getBox() {return s;}
	
	public String toString() {
		return s;
	}
}