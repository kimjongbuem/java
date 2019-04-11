package CH28;

import java.util.function.ToIntBiFunction;

public class Yoon28_1_3 {

	public static void main(String[] args) {
		// �ν��Ͻ� �޼ҵ� ���� 2 
		// �ν��Ͻ� ���� �ν��Ͻ� �޼ҵ� ����
		// ToIntBiFunction<T,U> int applyAsInt(T t, U u)
		IBox ib1 = new IBox(5);
		IBox ib2 = new IBox(7);
		
		ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2);
		// ù��° ���ڷ� �޼ҵ带 ȣ���ϰ� �� �޼ҵ��� �Ű������� 2��° ���ڰ� ����~
		ToIntBiFunction<IBox, IBox> bfs = IBox::lower;
		int bigNum = bf.applyAsInt(ib1, ib2);
		int smallNum = bfs.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
		System.out.println(smallNum);
	}

}
class IBox{
	private int n;
	public IBox(int i ) {n = i;}
	public int larger(IBox b) {
		if(n > b.n)
			return n;
		else
			return b.n;
	}
	public int lower(IBox b) {
		if(n < b.n)
			return n;
		else
			return b.n;
	}
}
