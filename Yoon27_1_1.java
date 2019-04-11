package CH27;
import java.util.*;
public class Yoon27_1_1 {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		Print p ;
		p = (String s)->{System.out.println(s.substring(5, 8)); System.out.println(s);};
		p.print("helloWOrld");
		p = (s) ->System.out.println(s); // String, { 문장이  하나의 경우 중괄호  } 생략
		p.print("helloWOrld");
		p = s ->System.out.println(s); // 매개변수 괄호생략 , 그리고 람다를 재정의 할 때마다 인스턴스 다시생성.
		
		Calculate c;
		c = (a,b) ->{return a+b;}; // 매개변수가 2개 이상이라면.. 매개변수 괄호로 무조건 묶어주어야해
		System.out.println(c.cal(4, 3)); // 또한 리턴문은 괄호로 묶어줘!
		
		c = (a,b) -> a+b; // 연산결과가 남으면 별도로 명시하지 않아도 return 안써도 됨
		// 문장의 시작부분 
	}

}
interface Print{           
	void print(String s);  
}
interface Calculate{
	int cal(int a, int b);
	// void cal(int a, int b);
}