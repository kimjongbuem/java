package CH27;
import java.util.*;
public class Yoon27_1_1 {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		Print p ;
		p = (String s)->{System.out.println(s.substring(5, 8)); System.out.println(s);};
		p.print("helloWOrld");
		p = (s) ->System.out.println(s); // String, { ������  �ϳ��� ��� �߰�ȣ  } ����
		p.print("helloWOrld");
		p = s ->System.out.println(s); // �Ű����� ��ȣ���� , �׸��� ���ٸ� ������ �� ������ �ν��Ͻ� �ٽû���.
		
		Calculate c;
		c = (a,b) ->{return a+b;}; // �Ű������� 2�� �̻��̶��.. �Ű����� ��ȣ�� ������ �����־����
		System.out.println(c.cal(4, 3)); // ���� ���Ϲ��� ��ȣ�� ������!
		
		c = (a,b) -> a+b; // �������� ������ ������ ������� �ʾƵ� return �Ƚᵵ ��
		// ������ ���ۺκ� 
	}

}
interface Print{           
	void print(String s);  
}
interface Calculate{
	int cal(int a, int b);
	// void cal(int a, int b);
}