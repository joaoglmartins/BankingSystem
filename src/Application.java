import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
	static int numberOfBankAccounts = 10;
	static int numberOfTransactions = 15;

	public static void main(String[] args) {
		List<BankAccount> bankAccounts = new ArrayList<>();
		Random random = new Random(1); // seeded
		
		// create some bank accounts
		for (int i = 0; i < numberOfBankAccounts; i++) {
			int isSavingsAccount = random.nextInt(2);
			
			if (isSavingsAccount == 0) {
				bankAccounts.add(new SavingsAccount(i + "", "person_" + i, 1000, 2));
			} else {
				bankAccounts.add(new CheckingAccount(i + "", "person_" + i, 1000, 100));
			}
		}
		
		for (int i = 0; i < numberOfTransactions; i++) {
			int isDeposit = random.nextInt(2);
			int accountIndex = random.nextInt(numberOfBankAccounts);
			int amount = random.nextInt(100);
			
			if (isDeposit == 0) {
				bankAccounts.get(accountIndex).deposit(amount);
			} else {
				bankAccounts.get(accountIndex).withdraw(amount);
			}
		}
		
		for (BankAccount account : bankAccounts) {
			System.out.println("---");
			account.displayAccountInfo();
			System.out.println("---");
			System.out.println();
		}
	}

}
