package com.uno;
class Person{
	String name;
	String aadharNo;
	String mobileNo;
	String address;
}

class Employee extends Person{
	int id;
	String orgName;
	int salary;
}
interface Bank{
	void deposit(int amt);
	void withDraw(int amt);
	void checkBalance();
}

class HDFCBank implements Bank{
	int accno;
	String name;
	int balance;
	public HDFCBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void deposit(int amt) {
		if(amt > 50000) {
			System.out.println("From HDFCBank:::Daily u canot deposit >"+amt);
					
		}
		else {
			this.balance = this.balance + amt;
			System.out.println("From HDFCBank:::Successfully deposited  amount..."+amt);
		}
	}
	@Override
	public void withDraw(int amt) {
		if(amt > 20000) {
			System.out.println("From HDFCBank:::Daily u canot withdraw >"+amt);
					
		}
		else {
			this.balance = this.balance - amt;
			System.out.println("From HDFCBank:::Successfully withDrawn  amount..."+amt);
		}
	}
	@Override
	public void checkBalance() {
		System.out.println("From HDFCBank:::Available Balance---->"+this.balance);
			
	}
	
}



class ICICIBank implements Bank{
	int accno;
	String name;
	int balance;
	public ICICIBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From ICICIBank:::Successfully deposited  amount..."+amt);
	}
	@Override
	public void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("From ICICIBank::::Successfully withdrawn  amount..."+amt);
		
	}
	@Override
	public void checkBalance() {
		System.out.println("From ICICIBank::::Available Balance---->"+this.balance);
			
	}
}
	public class Demo{
	
	public static void main(String[] args) {
		Bank bank;

		bank = new HDFCBank(10023,"karthik",45000);
		
		bank.checkBalance();
		bank.deposit(12000);
		
		bank.checkBalance();
		bank.deposit(55000);
		bank.checkBalance();
		
		bank = new ICICIBank(10024,"Rahul",30000);
		
		bank.checkBalance();
		bank.deposit(2000);
			
		bank.checkBalance();
		bank.deposit(125000);
		bank.checkBalance();
		
	}

}
