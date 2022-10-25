import java.util.Scanner;
public class DisplayArray {
     public static void main(String[] args)
     {
    	 Scanner scanner = new Scanner(System.in);
    	 int array[] = new int[10];
    	 System.out.println("Enter the elements of an array:");
    	 for(int i=0; i<10; i++)
    	 {
    		 array[i] = scanner.nextInt();
    	 }
    	 System.out.println("The elements of the array are printed below:");
    	 for(int i=0;i<10;i++)
    	 {
    		 System.out.println(array[i] +"   ");
    	 }
     }
}
