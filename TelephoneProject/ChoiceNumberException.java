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
		System.out.println(number+"�� �ش��ϴ� �������� �����ϴ� !");
		System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�...");
	}
}
