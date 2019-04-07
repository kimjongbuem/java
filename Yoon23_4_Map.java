package CollectionFrameWork;
import java.util.*;
public class Yoon23_4_Map {

	public static void main(String[] args) {
		// Map<K,V> //
		/*collection class는 iterator 인터페이스를 상속하는데..
		 * Map는 iterator인터페이스를 구현하지 않아... 허걱! -> 반복자 못얻어.
		 * k = key v = value 나이솨!
		 * key는 중복되면 안됑...
		 * 
		 * 반복자를 쓰고 싶다 그러면 Set 인터페이스 를 이용하자
		 * Set<K> keySet() 이함수는 해당 HashMap 클래스가 갖고있는 키들을 모우모아서 Set형태 인스턴스로 반환해준다.
		 */
		HashMap<Integer,String> map = new HashMap<>();
		map.put(45, "brown");
		map.put(37, "jason");
		map.put(23, "Martin"); // 추가
		
		System.out.println(map.get(45)); // 가져오기
		System.out.println(map.get(37)); 
		System.out.println(map.get(10));
		
		//map.remove(37); // 해당키와관련된 정보 제거
		
		System.out.println(map.get(37));
		System.out.println();
		Set<Integer> ks = map.keySet();
		for(Integer n : ks) // key 출력.
			System.out.print(n+"\t");
		System.out.println();
		for(Integer n : ks) // key 출력.
			System.out.print(map.get(n) +'\t');
		System.out.println();
			for(Iterator<Integer> I = ks.iterator() , L = ks.iterator(); L.hasNext();)
				System.out.println("KEY : "+ L.next()+" Value : "+map.get(I.next()));
	}

}
