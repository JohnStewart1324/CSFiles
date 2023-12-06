
public class CheckingAccount extends BankAccount {
	int transactionCount;
	final int FREE_TRANSACTIONS = 3;
	final double TRANSACTION_FEE = 2.0;
	final double CLOSING_FEE = 5.0;
	final double MAINTENANCE_FEE = 10.0;
	
	public CheckingAccount() {
		this.transactionCount = 0;
	}
	
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		this.transactionCount = 0;
	}
	
	public void deposit(double amount) {
		balance += amount;
		if (transactionCount >= FREE_TRANSACTIONS) {
			balance -= TRANSACTION_FEE;
			transactionCount = 0;
		} else {
			transactionCount++;
		}
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		if (transactionCount >= FREE_TRANSACTIONS) {
			balance -= TRANSACTION_FEE;
			transactionCount = 0;
		} else {
			transactionCount++;
		}
		
	}
	
	public void deductMaintenanceFee() {
		balance -= MAINTENANCE_FEE;
		transactionCount = 0;
	}
	
	public void close(BankAccount other) {
		transactionCount = 0;
		other.balance += this.balance;
		other.balance -= CLOSING_FEE;
		this.balance = 0;
		
	}
}
