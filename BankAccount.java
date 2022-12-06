

import java.util.*;

public class BankAccount{	{
		
		
		
		String name;
		String AccNo;
		String AccType;
		int age;
		int AccBalance;
		int size;
		int op;
	    Scanner scanner = new Scanner(System.in);
		void create()
		{
			int size;
			System.out.println("Enter the number of customers:");
			Scanner scanner1 = new Scanner(System.in);
			size = scanner1.nextInt();
			String name;
			String AccNo;
			String AccType;
			int age;
			int AccBalance;
			int op;
			for(int i=1; i<size; i++)
			{
				System.out.println("Enter the Official Name:");
				name = scanner1.nextLine();
				System.out.println("Enter the Official Account Number:");
				AccNo = scanner1.nextLine();	
				System.out.println("Enter the Account Type:");
				AccType = scanner1.nextLine();
				System.out.println("Enter the age:");
				age = scanner1.nextInt();
				System.out.println("Enter the Account Balance:");
				AccBalance = scanner1.nextInt();
				
			}
		}
		void display()
		{
			String name;
			String AccNo;
			String AccType;
			int age;
			int AccBalance;
			int op;		}
			System.out.println("Your Name is"+name);
			System.out.println("Your Account Number is"+AccNo);
			System.out.println("Your Account Type is"+AccType);
			System.out.println("Your Age is"+age);
			
		}
		void search()
		{
			String name;
			String AccNo;
			String AccType;
			int age;
			int AccBalance;
			int op;
			System.out.println("Enter the account number to be checked:");
			String accno1;
			Scanner scanner = new Scanner(System.in);
			accno1 = scanner.nextLine();
			if(AccNo == accno1)
			{
				display();
			}
		}
		
		Class InsufficientAmountException extends Exception
		{
			void InsufficientAmountsException(String msg)
			{
				String msg = System.out.println("not able to withdraw");
			}
		}
		
		
		Class InvalidAmountException extends Exception
		{
			void InvalidAmountsException(String msg)
			{
				String msg = System.out.println("not able to deposit");
			}
		}
		
		
		
		void withdraw(int amt)
		{String name;
		String AccNo;
		String AccType;
		int age;
		int AccBalance;
		int op;
			System.out.println("Enter the amount to withdraw :");
			int amt1;
			Scanner scanner = new Scanner(System.in);
			amt1 = scanner.nextInt();
			if(amt1>AccBalance) 
			{
			   throw 
			   
			}
			else
			{
				System.out.println("The current balance is "+(AccBalance-amt));
			}
			
		}
		
		
		void deposit(int amt)
		{
			
			String name;
			String AccNo;
			String AccType;
			int age;
			int AccBalance;
			int op;
			if(amt<0)
			{
				
			}
			else 
			{
				System.out.println("The current balance is"+(AccBalance+amt));
			}
		}
		public class BankAccount{
		public static void main(String [] args) {
			int i;
			String name;
			String AccNo;
			String AccType;
			int age;
			int AccBalance;
			int size;
			int op;
		}
		System.out.println("Enter the number of customers:");
		Scanner scanner1 = new Scanner(System.in);
		size = scanner1.nextInt();	
		BankAccount b[] = new BankAccount[size];
		for(i=!0; i<b.length; i++)
		{
			b[i] = new BankAccount();
			b[i].create();
		}
		
		do
		{
			System.out.println("Enter the option to carry on:\n 1.Display \n 2.Search \n 3. Withdraw \n 4. Deposit");
			op = scanner1.nextInt();
			
			switch(op)
			{
			case 1:
				create();				
				display();
				break;
			case 2:
				search();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				deposit();
				break;
			default:
				System.out.println("Enter the correct choice!! Bye");
				break;
			}
		}
			while(op<4);
		}
}
		

