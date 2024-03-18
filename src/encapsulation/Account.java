package encapsulation;

public class Account {
	
	/*
	* The wrapping up of data and methods on to single unit(class).

	* All variables should be private.
	* For every variable there should be 2 methods( getter and setter).
	* Variables can be operated only through methods.*/
	
	private int accno;
	private String name;
	private double amount;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
