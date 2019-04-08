import java.util.*;
public class Yoon24_CollectionAlgorithm {

	public static void main(String[] args) {
		// sort , copy, search ����ϱ� ���� �˰����, �޼ҵ� //
		/*public static <T extends comparable<? super T>> void sort (List<T> list){   }
		 * ���׸��޼ҵ��ε�, comparable�� ����,����� Ŭ������ �������̽��ε�, ? super T�� ���̻�+���� Ŭ������ ȣ���ϰ� �ֱ⸸�ϰڴ�.
		 * ���� Ŭ�������� ��Ӱ��迡�� ����Ŭ������ comparable<����Ŭ����>�� �س��� �� ����Ŭ������ �׳� T�� ���� �����Ͽ����� �ֳ��ϸ� Comparable<����Ŭ����>�� �����ȵ�
		 * 
		 */
		List<String> list = Arrays.asList("Toy","Box","Robot","Melon");
		list = new ArrayList<>(list);
		// ����������� //
		for(Iterator<String> i = list.iterator();i.hasNext();) {
			System.out.print(i.next()+"\t");
		}
		System.out.println();
		// ���� ���� ��� //
		Collections.sort(list); // �����Լ�
		for(Iterator<String> i = list.iterator();i.hasNext();) {
			System.out.print(i.next()+"\t");
		}
		System.out.println();
		
	}

}
