
public abstract class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
		
	}

	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void displayAccountInfo();
	
}
