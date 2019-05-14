package test;

public class Ch5_8 {

	public static void main(String[] args) {
		EXStack stack = new EXStack();
		stack.push(10); stack.push(20); stack.push(30); stack.push(40);
		stack.push(50); stack.push(60); stack.push(70); stack.push(80);
		int val;
		while((val = stack.pop())!= -1) {
			System.out.print(val+"\t");
		}
	}
}
class EXStack{
	private int stack[];
	int sp = 0;
	EXStack(){
		stack = new int[100];
	}
	EXStack(int size){
		stack = new int[size];
	}
	public void push(int data) {
		if(sp >= stack.length)
			System.out.println("������ �ʰ��Ͽ� ���� ���� �� �����ϴ�.");
		sp++;
		stack[sp] = data;  // �ε��� 1������ ����.
	}
	public int pop() {
		if(sp <= 0)
		{
			System.out.println("���̻� pop�� �����Ͱ� �����ϴ�..");
			return -1;
		}
		return stack[sp--];
	}
}