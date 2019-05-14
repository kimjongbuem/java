package test;

public class Account {
	private double balance;
	public Account(double initialDeposit) {
		balance = initialDeposit;
	}
	public synchronized double getBalance() {
		return balance;
	}
	public synchronized void deposit(double amount){
		balance +=amount;
	}
}

class Teller extends Thread{
	String name;
	double amount;
	Account account;
	Teller(String name, Account account, double amount){
		this.name = name; 
		this.amount = amount;
		this.account = account;
	}
	public void run() {
		account.deposit(amount);
		System.out.println(name + " : " +account.getBalance());
	}
}
