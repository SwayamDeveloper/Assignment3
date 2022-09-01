import java.util.Scanner;

abstract class Account  
{
	abstract void getbalance();
	abstract void withdrawAmount();
	abstract void depositeAmount();
	
}
class Currentac extends Account   
{
	 void getbalance() {
		 
		 System.out.println("Balance is: 5000 rupees");
		 
	 }
	 void withdrawAmount()
	 {
		 System.out.println("Transaction charges are 50 rupees per transaction");
		 
	 }
	 void depositeAmount()
	 {
		 System.out.println("Transaction charges are 50 rupees per transaction");
		 
	 }
	 
}
class SavingAc extends Account 
{
	void getbalance()
	{
		
		 System.out.println("Balance is 5000 rupees");
		
	}
	
	void withdrawAmount()
	{
		System.out.println("No transaction fee");
	}
	
	void depositeAmount()
	{
		System.out.println("No Transaction fee");
	}
	
}
public class Account1 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-> Enter  Account type \n 1.CurrentAccount \n 2.Saving Account"); 
		
		String name = sc.nextLine();
		
		System.out.println("Enter Account Number");
		
		int acNumber = sc.nextInt();
		
		System.out.println("What do you need");
		
		System.out.println("Withdraw amount");
		
		System.out.println("Deposit money");
		
		
		int op = sc.nextInt();
		}
}

