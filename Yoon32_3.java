package CH32_IO_Stream;
import java.io.*;
public class Yoon32_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Writer out = new FileWriter("data.txt")){
			out.write(370);
			out.write('วั');
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
