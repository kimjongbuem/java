package CH28;

import java.util.function.Function;

public class Yoon28_1_4 {

	public static void main(String[] args) {
		// �ν��Ͻ� ���� �ν��Ͻ� �޼ҵ� ���� 3 // ������ ���� Fuction<T, R>
		Function<char[], String> f = ar->{return new String(ar);};
		f = ar-> new String(ar);
		f = String::new; 
		char[] src = {'R','o','b','o','t'};
		System.out.println(src[0]);
		String str = f.apply(src);
		System.out.println(str);
	}

}
