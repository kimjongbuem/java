package CollectionFrameWork;
import java.util.*;
public class Yoon23_4_Map {

	public static void main(String[] args) {
		// Map<K,V> //
		/*collection class�� iterator �������̽��� ����ϴµ�..
		 * Map�� iterator�������̽��� �������� �ʾ�... ���! -> �ݺ��� �����.
		 * k = key v = value ���̼�!
		 * key�� �ߺ��Ǹ� �ȉ�...
		 * 
		 * �ݺ��ڸ� ���� �ʹ� �׷��� Set �������̽� �� �̿�����
		 * Set<K> keySet() ���Լ��� �ش� HashMap Ŭ������ �����ִ� Ű���� ����Ƽ� Set���� �ν��Ͻ��� ��ȯ���ش�.
		 */
		HashMap<Integer,String> map = new HashMap<>();
		map.put(45, "brown");
		map.put(37, "jason");
		map.put(23, "Martin"); // �߰�
		
		System.out.println(map.get(45)); // ��������
		System.out.println(map.get(37)); 
		System.out.println(map.get(10));
		
		//map.remove(37); // �ش�Ű�Ͱ��õ� ���� ����
		
		System.out.println(map.get(37));
		System.out.println();
		Set<Integer> ks = map.keySet();
		for(Integer n : ks) // key ���.
			System.out.print(n+"\t");
		System.out.println();
		for(Integer n : ks) // key ���.
			System.out.print(map.get(n) +'\t');
		System.out.println();
			for(Iterator<Integer> I = ks.iterator() , L = ks.iterator(); L.hasNext();)
				System.out.println("KEY : "+ L.next()+" Value : "+map.get(I.next()));
	}

}
