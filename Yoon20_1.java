package test;

public class Yoon20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 자료형 값을 감싸는 인스턴스? 래퍼클래스 !
		// 기본자료형은 object 클래스만 관계가없다.
		Integer iInst = new Integer(3);
		showData(iInst);
		showData(new Double(7.15));
		Integer iObj = new Integer(10); // 박싱은 인스턴스 생성을 통해.
		Double dObj = new Double(3.14);
		int num1 = iObj.intValue( ); //값만 꺼냄 삭제 아님.. ok? 언박싱은 메소드를 통해,
		double num2 = dObj.doubleValue( );
		Integer n1 = Integer.valueOf(5); // == new Integer(5) 와 결과가 같다 !!
		Integer n2 = Integer.valueOf(2262);
		System.out.println("큰 수 : " + Integer.max(n1,n2));
		System.out.println("작은 수 : " + Integer.min(n1,n2));
		System.out.println("합 : " + Integer.sum(n1,n2));
		System.out.println("12의 16진 표현 : "+ Integer.toHexString(12));
	}
	public static void showData(Object obj) {
		System.out.println(obj); // toString 메소드 호출 하고 println 호출
	}
//	public String toString() {
//		return string object
//	}
}
