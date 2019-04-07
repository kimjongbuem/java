package CollectionFrameWork;
import java.util.*;
public class Yoon23_4_Queue {

	public static void main(String[] args) {
		/*Queue method
		 * 예외처리알고리즘적용
		 * boolean add(E e)
		 * E remove()
		 * E element()
		 * 
		 * 기능은 같은데 예외를 발생안시킴 그대신 반환 값을 말해주어서 판단하게함.
		 * boolean offer(E e) // 넣을공간없으면 false
		 * E poll // 꺼낼 대상 없으면 null
		 * E peek // 확인하기, 확인할 대상 없으면 null임.
		 */
		Queue<String> que = new LinkedList<>(); // queue interface 리스트가 내부인 큐.
		
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
