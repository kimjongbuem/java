package javaEX;

public class ExerciseCh4_5_2 {

	public static void main(String[] args) {
		int i, n;
		char[]s = {'3', '5', '6', '\0'};
		n = 0;
		i = 0;
		while(true) {
			if(!(s[i]>='0'&&s[i]<='9'))
				break;
			else {
				n = 10*n + (s[i]-'0');
			}
			i++;
		}
		System.out.println("N = " + n);
	}

}
