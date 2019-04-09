package CH25;

public class Yoon25_3 {

	public static void main(String[] args) {
		Viewer v = new Viewer();
		v.ShowIt("Hello"); // 문제의 발생소지가 있거나 개선된 기능의 다른 것으로 대체되어서 더이상 필요없음
		v.brShowIt("WOrldZ"); 
	}

}
interface Viewable{
	@Deprecated
	public void ShowIt(String str);
	
	public void brShowIt(String str);
}

class Viewer implements Viewable{

	@Override
	@SuppressWarnings("deprecation") // 해당 디프리케이션 경고 메시지창 생략
	public void ShowIt(String str) {
		System.out.println(str);
	}

	@Override
	public void brShowIt(String str) {
		System.out.println(str);
	}
	
//	@Override // 나는 부모클래스의 showit메소드를 오버라이드 관계를 만들어줄건데 아니네? 컴파일러가 에러를 만듬
//	public void ShowIt(String str, String s) {
//		System.out.println(str);
//	}
	
}