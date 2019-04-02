package javaEX;
import java.util.StringTokenizer;
public class ExToken {

	public static void main(String[] args) {
		StringTokenizer token1 = new StringTokenizer("PM:06:24", ":");
		while(token1.hasMoreTokens())
		{
			System.out.println(token1.nextToken());
		}
	}
}
