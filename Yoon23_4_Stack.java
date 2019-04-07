package CollectionFrameWork;
import java.util.*;
public class Yoon23_4_Stack {

	public static void main(String[] args) {
		// Stack //
		/*Deque�� �������� ������ �����ϴ� ���� �ڹٿ����� ��Ģ
		 * ������ �ְ� ������ Ȯ���ϱ�
		 * ���� �߻� ó�� ����.
		 * boolean offerFirst(E e) boolean offerLast(E e) <= addLast�̰� ����..
		 * E pollFirst() ...  + last
		 * E peekFirst() ...  + last
		 * LinkeredList�� �����ϴ� �������̽� deque, list, Queue 
		 * �׳� �̰ɽ���ó�� ���... ����
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
