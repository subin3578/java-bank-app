package JavaBankApp;

public class Account {
// Account (int ano, String owner, int balance);
	private String ano;
	private String owner;
	private int balance;
	
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}


	public String getano() {
		return ano;
	}


	public String getowner() {
		return owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String toString() {
		return ano +" " + owner+ " " + balance;
		
	}
}
