/**
Filename : LargeSmall.java
Description : This program finds largest and smallest element of an array. 
Created By : Brisly Binoy
Date : 24/09/2022
 * 
 */
import java.util.Scanner;
public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Please enter value of N: ");

		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int largest = Integer.MIN_VALUE;
		    int smallest = Integer.MAX_VALUE;

		    System.out.printf("Please enter %d numbers %n", n);
		    for (int i = 0; i < n; i++) {

		      int current = sc.nextInt();
		      if (current > largest) {
		        largest = current;
		      }
		      if (current < smallest) {
		        smallest = current;

		      }
		    }

		    System.out.println("largest of N number is : " + largest);
		    System.out.println("smallest of N number is : " + smallest);
		  }

	}


