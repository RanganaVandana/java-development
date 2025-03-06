package Task3;

import java.util.*;
 class Banking {
	private double balance;
	
	public Banking(double Initial) {
		balance = Initial;
	}
	
	public double getBalance() {
		return balance;
	}
	public void deposite(double amt) {
		balance = balance + amt;
	}
	public boolean withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		return true;
		}else {
			return false;
		}
	}
 }

 class Auto{
	 private Banking acc;
	 
	 public Auto(Banking acc) {
		 this.acc = acc;
	 }
	 
	 public void display() {
		 System.out.println("Welcome to the ATM");
		 System.out.println("1. Check Balance");
		 System.out.println("2. Deposite");
		 System.out.println("3. Withdraw");
		 System.out.println("4. Exit");
	 }
	 
	 public void Inter() {
		 Scanner sc=new Scanner(System.in);
		 
		 int ch;
		 double amount;
		 
		 while(true) {
			 display();
			 System.out.println(" Enter your choice: ");
			 
			 ch=sc.nextInt();
			 
			 switch(ch) {
			 	case 1:
			 		System.out.println("Your balance is: Rs. "+acc.getBalance());
			 		break;
			 	case 2: 
			 		System.out.println("Enter the deposit amount : Rs.");
			 		amount=sc.nextDouble();
			 		if(amount>0) {
			 			acc.deposite(amount);
			 			System.out.println("Deposite Successfully.");
			 		}else {
			 			System.out.println("Invalid deposite amount.");
			 		}
			 		break;
			 		
			 	case 3:
			 		System.out.println("Enter the withdrawal amount: Rs.");
			 		amount=sc.nextDouble();
			 		if(amount>0 && acc.withdraw(amount)) {
			 			System.out.println("Withdraw Successfully.");
			 		}else {
			 			System.out.println("Invalid withdrawal amount. ");
			 		}
			 		break;
			 	case 4:
			 		System.out.println("Thank you for using the ATM.");
			 		return;
			 	default:
			 		System.out.println("Invalid choice. Please Try again.");
		 }
	 }
 }
}
 
 
 public class ATM{
	 public static void main(String args[]) {
		 Banking user=new Banking(10000);
		 Auto atm=new Auto(user);
		 atm.Inter();
	 }
 }
