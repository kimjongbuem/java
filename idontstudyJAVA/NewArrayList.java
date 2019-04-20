package idontstudyJAVA;
import java.util.*;
public class NewArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.ensureCapacity(500);
		arr.ensureCapacity(arr.size()*2);
	}

}
