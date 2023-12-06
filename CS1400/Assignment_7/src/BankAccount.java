
public class BankAccount {
	
	double balance;
	
	public BankAccount() {
		this.balance = 0;
	}
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void transfer(double amount, BankAccount other) {
		this.balance -= amount;
		other.balance += amount;
	}
	
	public void close(BankAccount other) {
		other.balance += this.balance;
		this.balance = 0;
		
	}
	

}
