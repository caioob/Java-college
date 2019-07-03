package assignment_6;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

public class Account implements java.io.Serializable{
	int id;
	static String firstName, lastName;
	double balance, annualInterestRate;
	Date dateCreated;
	RandomAccessFile raf;
	
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;

	}
	
	Account(int id_, double balance_) throws IOException{
		id = id_;
		balance = balance_;
		annualInterestRate = 0;
		try {
			raf = new RandomAccessFile("test.dat", "rw");			
		}
		finally {
			System.out.println(id+ " " +balance);
			raf.writeInt(id);
			raf.writeDouble(balance);
			raf.writeDouble(annualInterestRate);
			raf.close();
		}
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getRate() {
		return annualInterestRate;
	}	
	
	public Date getDate() {
		return dateCreated;
	}
	
	public void changeId(int id_) {
		id = id_;
	}
	
	public void changeBalance(double balance_) {
		balance = balance_;
	}
	
	public void changeInterest(double annualInterestRate_) {
		annualInterestRate = annualInterestRate_;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public void whitdrawl(double ammount)  {
		try {
			if((balance -= ammount) < 0) {
				throw new balance_exception();
			}
		}
		catch(balance_exception be){
			System.out.println(be);
		}
		finally{
			balance -= ammount;
		}
	}
	
	public void deposit(double ammount) {
		
		try {
			if(ammount < 0) {
				throw new balance_exception();
			}
		}
		catch(balance_exception be) {
			System.out.println(be);
		}
		
		finally {
			balance += ammount;
		}
	}
	
}
