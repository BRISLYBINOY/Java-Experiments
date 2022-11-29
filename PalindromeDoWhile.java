/**
Filename : ReverseDoWhile.java
Description : This program reverses a number and checks whether it is a palindrome using do-while loop.
Created By : Brisly Binoy
Date : 24/09/2022
 * 
 */
public class PalindromeDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=878, remainder,reverse = 0,temp;
		temp = Number;
	    do
	    {
	    	remainder = Number % 10;
	    	reverse = reverse*10 + remainder;
	    	Number = Number/10;
	    }while(Number!=0);
	    {
	    	System.out.println("The reverse of the given number is "+reverse);
	    }
	    if (reverse == temp)
	    {
	    	System.out.println("The given number is a palindrome.");
	    }
	    else
	    {
	    	System.out.println("The given number is not a palindrome.");
	    }
	}

}
