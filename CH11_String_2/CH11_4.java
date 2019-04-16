package CH11_String_2;

public class CH11_4 {

	public static void main(String[] args) {
		//String�� immutable �ν��Ͻ�   �߰� : String str2 = str1 �̶�� �Ѵ� �����ν��Ͻ���//
		// TODO Auto-generated method stub
		String s = 1+"lemon"+32; // String.valueOf(1).concat("lemon").concat(String.valueOf(32))
		String s2 = String.valueOf(1).concat("lemon").concat(String.valueOf(32));
		System.out.println(s2);
		// �ν��Ͻ� ����� �ϰ� �ϸ� ��¥ ȿ�� ��������  �׷���... //
		String str4 = new StringBuilder().append(1).append("lemon").append(2).toString();
		System.out.println(str4);
		/*
		 * String�� �������� �Ұ����� ���ڿ��� ǥ���� ���� Ŭ���� ������, StringBuilder�� StringBuffer�� ���
		 * ���氡���� ���ڿ��� ǥ���� ���� Ŭ������.
		 * �� String�� �޸� StringBuilder�� StringBuffer�� �ν��Ͻ��� ������ ���ڿ��̶� ���������� ����ض�.
		 * StringBuilder�� ���ڿ��� ����� ������ ���� �޸� ������ ���ο� ���ϴµ�, ũ�Ⱑ �ڵ����� ������
		 */
		
		StringBuilder builder = new StringBuilder("AB");
		builder.append(25).append('Y').append(true);
		System.out.println(builder);
		builder.insert(2, false).insert(builder.length(), 'Z');
		System.out.println(builder);
		
		
		/********************************************/
		String str ="ABCDEFGHIZKL...";
		StringBuilder builders = new StringBuilder(str);
		builders = builders.reverse();
		System.out.println(builders);
		/*******************************************/
		str = "99--0-2-08--10-127-52";
		builders = new StringBuilder(str);
		for(int i =0;i<builders.length();i++) {
			if(builders.charAt(i)=='-')
				builders.deleteCharAt(i--);
		}
		System.out.println(builders);
		// StringBuffer�� ������ �������� �����ִ�.
	}

}
