/**
Filename : ReverseFor1.java
Description : This program reverses a number using for loop.
Created By : Brisly Binoy
Date : 24/09/2022
 * 
 */
public class ReverseFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=345678, remainder,reverse = 0;
	    for (;Number!=0;)
	    {
	    	remainder = Number % 10;
	    	reverse = reverse*10 + remainder;
	    	Number = Number/10;
	    }
	    System.out.println("The reverse of the given number is "+reverse);
	    
	}

}
