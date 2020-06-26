package entities;

public class BankAccount {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		
	}
	
	

	public BankAccount(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		depositMoney(initialDeposit);
	}

	public void setName(String name) {
		 this.name =  name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double depositMoney(double money ) {
		return this.balance = balance + money;
	}
	
	public double withDrow(double money) {
		return this.balance = balance - money - 5;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber 
				+ ", Holder: "
				+ name 
				+ ", Balance "
				+ String.format("%.2f", balance);
				
	}
}
