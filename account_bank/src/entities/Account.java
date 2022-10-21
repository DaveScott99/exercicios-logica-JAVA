package entities;

public class Account {

	private int code;
	private String name;
	private double balance;
	

	public Account(int code, String name, double initialDeposit) { 
		this.code = code;
		this.name = name;
		deposit(initialDeposit);	
	}
	
	public Account(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}

	
	public String toString() {
		return "Account " + code + ", "+ "Holder: " + name + ", " + "Balance: $ " + balance;
	}
	
}
