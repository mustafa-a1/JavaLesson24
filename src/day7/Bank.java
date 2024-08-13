package day7;

public class Bank {

	private int acctNum;
	private String accName;
	private double amount;
	
	public int getAcctNum() {
		return acctNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bank [acctNum=" + acctNum + ", accName=" + accName + ", amount=" + amount + "]";
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
	
	
	
	
	
	
	
}
