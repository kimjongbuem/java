package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Yoon23_CollectionFrameWork_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>(); //ArrayList
		List<String> test = new ArrayList<>();
		List<String> test2 = Arrays.asList("Toy","Car","Robot");
		test2 = new ArrayList<>(list);
		// �ѹ��� �ʱ�ȭ... immutable �ν��Ͻ��� �����̶�... ����->
		// �ٽø���.
		list.add("Toy");
		list.add("Hello");
		list.add("Box");
		list.add("Robot");
		for(String s : list)
			System.out.println(s+"\t");
		String str;
		Iterator<String> itr = list.iterator(); // �ݺ���
		while(itr.hasNext()) 
		{	
			str= itr.next();
			if(str.equals("Box"))
				itr.remove();
		//System.out.println(itr);
			// �÷��� �����ӟp�� �ݺ��ڸ� ���� �̷��� ������ �����ϱ���~ ���̳�尡 �����Ѵ�  // 
		}
		System.out.println();
		for(String s : list) // for each , iterator ���.
			System.out.println(s+"\t");
		
		System.out.println();
		System.out.println();
		// ����� �ݺ��� //
		List<String> dList = Arrays.asList("Toy","Box","Robot","Box");
		dList = new ArrayList<>(dList);
		
		ListIterator<String> dIter = dList.listIterator();
		while(dIter.hasNext()) {
			str = dIter.next();
			System.out.print(str + "\t");
			if(str.equals("Toy"))
				dIter.add("Toy2");
		}
		System.out.println();
		
		while(dIter.hasPrevious()) {
			str = dIter.previous();
			System.out.print(str + "\t");
			if(str.equals("Robot"))
				dIter.add("Robot2");
		}
	}

}

