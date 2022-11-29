import Evenpackage.Even;
import java.util.Scanner;
public class Testpackage {
 public static void main(String[] args)
 {
	 int n;
	 System.out.println("Enter the number:");
	 Scanner src = new Scanner(System.in);
	 n =src.nextInt();
	 Even iseven = new Even();
	 iseven.number(n);
 }
}
