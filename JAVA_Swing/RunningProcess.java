package JAVA_Swing;
import java.io.*;
public class RunningProcess {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Process proc = Runtime.getRuntime().exec("java FirstAWTExitEvent");
		proc.waitFor();
		if(proc.exitValue() == 0)
			System.out.println("���̽� ����");
		else
			System.out.println("�����ΰ� ������...");
	}

}
