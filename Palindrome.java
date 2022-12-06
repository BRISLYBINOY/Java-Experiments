import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {

    String str , reverseStr = "";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string:");
    str = scanner.nextLine();
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) 
    {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.equalsIgnoreCase(reverseStr))
    {
      System.out.println(str + " is a Palindrome.");
    }
    else 
    {
      System.out.println(str + " is not a Palindrome.");
    }
  }
}