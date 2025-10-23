
public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
		super(accountNumber, accountHolder, initialBalance);
		this.interestRate = interestRate;
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
		System.out.println("Interest Rate: " + this.interestRate);
	}

}
