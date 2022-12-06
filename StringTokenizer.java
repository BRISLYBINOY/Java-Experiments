import java.util.StringTokenizer;
import java.util.Scanner;
public class Stringtokenizer{

	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			String s;
			System.out.print("Enter a line of numbers: ");
			s= sc.nextLine();
			StringTokenizer str = new StringTokenizer(s," ");
			int sum = 0;
			while(str.hasMoreTokens())
			{
				
				int a = Integer.parseInt(str.nextToken());
				System.out.println(a);
				sum = sum + a;
			}
			System.out.println("Sum of the numbers is: "+sum);
	}
}