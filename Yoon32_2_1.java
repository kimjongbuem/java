package CH32_IO_Stream;
import java.io.*;
public class Yoon32_2_1 {

	public static void main(String[] args) {
		// ���� ��Ʈ�� //
		// �߰��� ��� ������// 
		// File 1byte --> ����� �� ���� ���������, ����, ����, �Ǽ� ���� �� �����ϸ� 1����Ʈ�� ���� �Ф� //
		// java�� 4����Ʈ ������ ���� ����Ʈ������ �ɰ���(����� ����) �Ϲ������� ��������� 
		// ������ : 1����Ʈ 4�� ����ͼ� 4����Ʈ int�� ����
		// how to link filter Stream?
		try(DataOutputStream dOut = new DataOutputStream(new FileOutputStream("data.txt")
		)){ // ���ͽ�Ʈ���� ����Ǿ� �ִ� ��½�Ʈ���� �ڵ����� ������ ����
			dOut.writeInt(370);
			dOut.writeDouble(3.1545);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		try(DataInputStream dIn = new DataInputStream(new FileInputStream("data.txt")
				)){ // ���ͽ�Ʈ���� ����Ǿ� �ִ� ��½�Ʈ���� �ڵ����� ������ ����
					int num1 = dIn.readInt();
					double num2 = dIn.readDouble();
					System.out.println(num1);
					System.out.println(num2);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
	}

}
