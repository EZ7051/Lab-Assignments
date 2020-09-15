
import java.util.*;

class Account {
	private String memberName;
	private String accountNumber;
	private double accountBalance;

	public Account(String memberName, double accountBalance) {
		Random rand = new Random();
		this.accountNumber = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10)
				+ rand.nextInt(10);
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double money) {
		this.accountBalance += money;
	}
}

class SavingsAccount extends Account {
	private double interest = 5;
	private double maxWithdrawLimit;

	public SavingsAccount(String memberName, double maxWithdrawLimit, double initialBalance) {
		super(memberName, initialBalance);
		this.maxWithdrawLimit = maxWithdrawLimit;
	}
	
	public double getBalance() {
		return this.getAccountBalance() + interest;
	}

	public void withdraw(double money) {
		if (money <= maxWithdrawLimit && this.getAccountBalance() - money >= 500)
			this.setAccountBalance(this.getAccountBalance() - money);
	}
}


class CurrentAccount extends Account {
	String tradeLicenseNumber;

	public CurrentAccount(String memberName, String tradeLicenseNumber, double initialBalance) {
		super(memberName, initialBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	public double getBalance() {
		return this.getAccountBalance();
	}

	public void withdraw(double money) {
		if (money <= this.getAccountBalance())
			this.setAccountBalance(this.getAccountBalance() - money);
	}

}


public class ApplicationAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your user name: ");
		String memberName = sc.nextLine();
		System.out.print("Enter account type (savings/current): ");
		String accountType = sc.nextLine();
		double initialBalance;
		if (accountType.equals("savings")) {
			System.out.print("Enter initial balance (>500): ");
			initialBalance = sc.nextDouble();
			if (initialBalance < 500.0)
				initialBalance = 500.0;
			System.out.print("Enter maximum withdraw limit: ");
			double maxWithdrawLimit = sc.nextDouble();
			SavingsAccount s = new SavingsAccount(memberName, maxWithdrawLimit, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+s.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					s.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+s.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+s.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					s.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+s.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+s.getAccountBalance());
				}
				else if(choice==0) {
					break;
				}
			}

		} else if (accountType.equals("current")) {
			System.out.print("Enter initial balance: ");
			initialBalance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter trade license number: ");
			String tradeLicenseNumber = sc.nextLine();
			CurrentAccount c = new CurrentAccount(memberName, tradeLicenseNumber, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+c.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					c.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+c.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+c.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					c.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+c.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+c.getAccountBalance());
				}
				else if(choice==0) {
					break;
				}
			}
		}
		sc.close();
	}
}
