import java.util.*;
public class Yoon24_CollectionAlgorithm {

	public static void main(String[] args) {
		// sort , copy, search 사용하기 쉬운 알고리즘들, 메소드 //
		/*public static <T extends comparable<? super T>> void sort (List<T> list){   }
		 * 제네릭메소드인데, comparable를 구현,상속한 클래스나 인터페이스인데, ? super T는 나이상+상위 클래스만 호출하고 넣기만하겠다.
		 * 만약 클래스들의 상속관계에서 상위클래스가 comparable<상위클래스>로 해놨을 때 하위클래스가 그냥 T를 쓰면 컴파일에러임 왜냐하면 Comparable<하위클래스>는 구현안됨
		 * 
		 */
		List<String> list = Arrays.asList("Toy","Box","Robot","Melon");
		list = new ArrayList<>(list);
		// 정렬이전출력 //
		for(Iterator<String> i = list.iterator();i.hasNext();) {
			System.out.print(i.next()+"\t");
		}
		System.out.println();
		// 정렬 이후 출력 //
		Collections.sort(list); // 정렬함수
		for(Iterator<String> i = list.iterator();i.hasNext();) {
			System.out.print(i.next()+"\t");
		}
		System.out.println();
		
	}

}
