package CH25;

public class Yoon25_3 {

	public static void main(String[] args) {
		Viewer v = new Viewer();
		v.ShowIt("Hello"); // ������ �߻������� �ְų� ������ ����� �ٸ� ������ ��ü�Ǿ ���̻� �ʿ����
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
	@SuppressWarnings("deprecation") // �ش� ���������̼� ��� �޽���â ����
	public void ShowIt(String str) {
		System.out.println(str);
	}

	@Override
	public void brShowIt(String str) {
		System.out.println(str);
	}
	
//	@Override // ���� �θ�Ŭ������ showit�޼ҵ带 �������̵� ���踦 ������ٰǵ� �ƴϳ�? �����Ϸ��� ������ ����
//	public void ShowIt(String str, String s) {
//		System.out.println(str);
//	}
	
}