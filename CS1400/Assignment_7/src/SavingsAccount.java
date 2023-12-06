
public class SavingsAccount extends BankAccount {
	double interestRate;
	
	public SavingsAccount(double rate) {
		this.interestRate = rate;
	}
	
	public SavingsAccount(double rate, double initialBalance) {
		super(initialBalance);
		this.interestRate = rate;
	}
	
	public void addInterest() {
		balance *= (1 + interestRate);
		balance = Math.ceil(balance);
	}
	
	public void close(BankAccount other) {
		other.balance += this.balance;
		this.balance = 0;
	}
}
