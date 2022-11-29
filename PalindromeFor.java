/**
Filename : PalindromeFor.java
Description : This program checks whether a number is palindrome or not using for loop.
Created By : Brisly Binoy
Date : 24/09/2022
 * 
 */
public class PalindromeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=33, remainder,reverse = 0,temp;
		temp = Number;
	    for (;Number!=0;)
	    {
	    	remainder = Number % 10;
	    	reverse = reverse*10 + remainder;
	    	Number = Number/10;
	    }
	    System.out.println("The reverse of the given number is "+reverse);
	    if ( reverse == temp)
	    {
	    	System.out.println("The given number is a palindrome.");
	    }
	    else
	    {
	    	System.out.println("The given number is not a palindrome.");
	    }
	}

}
