package CH25;

public class Yoon25_2 {

	public static void main(String[] args) {
		ShowAll("Box","Melon");
		ShowAll("Box");
		ShowAll("Box","Melon","kakak");

	}
	public static void ShowAll(String... vars) { // String �ν��Ͻ� ����� �޾��ְڵ� �迭�� ���������̴�
		for(String s : vars)
			System.out.print(s+"\t"); // �迭ó�� ����!
		System.out.println();
	}
}
