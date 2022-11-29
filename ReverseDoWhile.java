/**
Filename : ReverseDoWhile.java
Description : This program reverses a number using do-while loop.
Created By : Brisly Binoy
Date : 24/09/2022
 * 
 */
public class ReverseDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=345678, remainder,reverse = 0;
	    do
	    {
	    	remainder = Number % 10;
	    	reverse = reverse*10 + remainder;
	    	Number = Number/10;
	    }while(Number!=0);
	    {
	    	System.out.println("The reverse of the given number is "+reverse);
	    }
	    
	}

}
