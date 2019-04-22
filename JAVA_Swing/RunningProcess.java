package JAVA_Swing;
import java.io.*;
public class RunningProcess {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Process proc = Runtime.getRuntime().exec("java FirstAWTExitEvent");
		proc.waitFor();
		if(proc.exitValue() == 0)
			System.out.println("나이스 종료");
		else
			System.out.println("무엇인가 문제가...");
	}

}
