import java.util.Scanner;

public class FrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int length, count =0,i;
    String str;
    char ch;
    System.out.println("Enter the String:");
    str = in.nextLine();
    System.out.println("Enter the letter:");
    ch = in.next().charAt(0);

    for (i=0; i<str.length(); i++)
    {
    	if(str.charAt(i)==ch)
    	{
    		count++;
    	}
    }
    System.out.println("Frequency is" +count);
    
	}

}
