package CollectionFrameWork;
import java.util.*;
public class Yoon23_4_Stack {

	public static void main(String[] args) {
		// Stack //
		/*Deque를 기준으로 스택을 구현하는 것이 자바에서의 원칙
		 * 앞으로 넣고 꺼내고 확인하기
		 * 예외 발생 처리 안함.
		 * boolean offerFirst(E e) boolean offerLast(E e) <= addLast이건 예외..
		 * E pollFirst() ...  + last
		 * E peekFirst() ...  + last
		 * LinkeredList가 구현하는 인터페이스 deque, list, Queue 
		 * 그냥 이걸스택처럼 써라... ㄷㄷ
		 */
		Deque<String> deq = new ArrayDeque<>();
		deq.offerFirst("1.box");
		deq.offerFirst("2.toy");
		deq.offerFirst("3.robot");
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}

}
