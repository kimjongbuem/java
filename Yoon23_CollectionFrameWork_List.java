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
		// 한번에 초기화... immutable 인스턴스임 고정이라... ㄷㄷ->
		// 다시만듬.
		list.add("Toy");
		list.add("Hello");
		list.add("Box");
		list.add("Robot");
		for(String s : list)
			System.out.println(s+"\t");
		String str;
		Iterator<String> itr = list.iterator(); // 반복자
		while(itr.hasNext()) 
		{	
			str= itr.next();
			if(str.equals("Box"))
				itr.remove();
		//System.out.println(itr);
			// 컬렉션 프레임웤은 반복자를 통해 이렇게 참조가 가능하구나~ 더미노드가 존재한다  // 
		}
		System.out.println();
		for(String s : list) // for each , iterator 기반.
			System.out.println(s+"\t");
		
		System.out.println();
		System.out.println();
		// 양방향 반복자 //
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

