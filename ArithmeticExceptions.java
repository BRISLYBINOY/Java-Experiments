import java.util.Scanner;
class Excep
{
   void ArithExcep(int x, int y)
   {
	   try 
	   {
		 int u = x/y;   
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e);
	   }
	   finally
	   {
		   System.out.println("Finally block");
	   }
   }
}
public class ArithmeticExceptions
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		Excep arith = new Excep();
		arith.ArithExcep(10, 0);
		
	}
}
