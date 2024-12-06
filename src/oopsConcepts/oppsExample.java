package oopsConcepts;

import java.util.Date;

//import java.sql.Date;

public class oppsExample {
	
	static String name, address;
	static int age;
	static Date dob;
	
	static void depositMoney(){
		System.out.println("Deposited Money");
	}
	
	static void withdrawMoney(){
		System.out.println("Withdrawed Money");
	}
	
	static void transferFunds(){
		System.out.println("Transfered Funds");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		depositMoney();
		withdrawMoney();
		transferFunds();
	}

}
