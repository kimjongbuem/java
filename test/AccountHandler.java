package test;

public class AccountHandler {

	public static void main(String[] args) {
		Account account = new Account(10000);
		Teller teller = new Teller("kim",account, 10000);	
		
		Teller teller2 = new Teller("enn",account, 10000);
		teller.start(); teller2.start();
	}
}
