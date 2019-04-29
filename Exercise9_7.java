package study;

public class Exercise9_7 {
	public static void main(String[] args) {
		int mysteriousState = Integer.parseInt(args[0]);
		
		while(true) {
			System.out.print("Who ");
			try {
				System.out.print("is ");
				if(mysteriousState == 1) return;
				System.out.println("that ");
				if(mysteriousState == 2) break;
				System.out.print("strange ");
				if(mysteriousState == 3) continue;
				System.out.print("but kindly ");
				if(mysteriousState == 4)
					throw new Error();
			}finally {
				System.out.print("amunsing ");
			}
			System.out.println("yet compelling");
			break;
		}
		System.out.println("man?");
	}

}
