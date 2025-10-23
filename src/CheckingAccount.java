
public class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
		super(accountNumber, accountHolder, initialBalance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void deposit(double amount) {
		double newBalance = this.getBalance() + amount;
		this.setBalance(newBalance);
	}

	@Override
	public void withdraw(double amount) {
		double newBalance = this.getBalance() - amount;
		this.setBalance(newBalance);
	}

	@Override
	public void displayAccountInfo() {
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Account Holder: " + this.getAccountHolder());
		System.out.println("Balance: " + this.getBalance());
		System.out.println("OverdraftLimit: " + this.overdraftLimit);
	}

}
