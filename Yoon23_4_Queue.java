package CollectionFrameWork;
import java.util.*;
public class Yoon23_4_Queue {

	public static void main(String[] args) {
		/*Queue method
		 * ����ó���˰�������
		 * boolean add(E e)
		 * E remove()
		 * E element()
		 * 
		 * ����� ������ ���ܸ� �߻��Ƚ�Ŵ �״�� ��ȯ ���� �����־ �Ǵ��ϰ���.
		 * boolean offer(E e) // �������������� false
		 * E poll // ���� ��� ������ null
		 * E peek // Ȯ���ϱ�, Ȯ���� ��� ������ null��.
		 */
		Queue<String> que = new LinkedList<>(); // queue interface ����Ʈ�� ������ ť.
		
		que.offer("BOX");
		que.offer("TOY");
		que.offer("Robot");
		System.out.println("next :" +que.peek());
		
		System.out.println("next :" +que.poll());
		System.out.println("next :" +que.poll());
		System.out.println("next :" +que.peek());
		System.out.println("next :" +que.poll());
		System.out.println("next :" +que.poll());
	}

}
