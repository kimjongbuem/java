package TelephoneProject;

public class ChoiceNumberException extends Exception{
	private char c;
	private String s;
	int number;
	ChoiceNumberException(char c){
		this.c = c;
	}
	ChoiceNumberException(int num){
		this.number = num;
	}
	ChoiceNumberException(String s){
		this.s = s;
	}
	public void showExceptionMessage() {
		System.out.println(number+"에 해당하는 선택지는 없습니다 !");
		System.out.println("메뉴 선택을 처음부터 다시 진행합니다...");
	}
}
