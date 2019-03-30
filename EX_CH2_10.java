package test;

public class EX_CH2_10 {
	static int hexValue(char ch) {
		switch (ch) {
		case '0': case '1': case '2': case '3': case '4':
		case '5': case '6': case '7': case '8': case '9':
			return (ch - '0'); // ���ڸ� ���
		case 'A': case 'B': case 'C': case 'D': case 'E': case 'F':
			return (ch - 'A' + 10); 
		case 'a': case 'b': case 'c': case 'd': case 'e': case 'f':
			return (ch - 'a' + 10);
		default: return -1;
		}
	}
	public static void main(String[] args) throws java.io.IOException {
		int num = 0;
		int value;
		char ch;
		
		ch = (char) System.in.read();
		if (ch == '0') {
			ch = (char) System.in.read();
			if((ch == 'X') || (ch == 'x'))
				while((value=hexValue(ch=(char) System.in.read())) != -1)
					num = 16 * num + value;
			else if((ch >= '0') && (ch <= '7'))
				do { num = 8*num + (int)(ch - '0');
					 ch = (char) System.in.read();
				} while((ch >= '0') && (ch <= '7'));
			else num = 0;
		} else do { num = 10*num + (int)(ch - '0');
					ch = (char) System.in.read();
		} while (Character.isDigit(ch));
		System.out.println(num);
	}	
	}
