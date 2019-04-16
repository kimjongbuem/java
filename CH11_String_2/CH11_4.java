package CH11_String_2;

public class CH11_4 {

	public static void main(String[] args) {
		//String은 immutable 인스턴스   추가 : String str2 = str1 이라면 둘다 동일인스턴스임//
		// TODO Auto-generated method stub
		String s = 1+"lemon"+32; // String.valueOf(1).concat("lemon").concat(String.valueOf(32))
		String s2 = String.valueOf(1).concat("lemon").concat(String.valueOf(32));
		System.out.println(s2);
		// 인스턴스 재생성 하고 하면 진짜 효율 쓰레기임  그래서... //
		String str4 = new StringBuilder().append(1).append("lemon").append(2).toString();
		System.out.println(str4);
		/*
		 * String은 변ㄱㅇ이 불가능한 문자열의 표현을 위한 클래스 이지만, StringBuilder와 StringBuffer의 경우
		 * 변경가능한 문자열의 표현을 위한 클래스임.
		 * 단 String과 달리 StringBuilder와 StringBuffer의 인스턴스를 가리켜 문자열이라 하지않음을 기억해라.
		 * StringBuilder는 문자열의 저장및 변경을 위한 메모리 공간을 내부에 지니는데, 크기가 자동으로 조절됨
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
		// StringBuffer는 스레드 안전성을 갖고있다.
	}

}
