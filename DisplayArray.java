import java.util.Scanner;
/**
 * 
 */

/**
 * @author cseb2
 *
 */
public class DisplayArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    		int array[] = new int[10];
    		System.out.println("Enter any ten elements of an array:");
    for(int i=0; i<10;i++)
    {
    	array[i] = scanner.nextInt();
    }
    System.out.println("The elements of the array are printed below:");
    for(int i=0; i<10;i++)
    {
    	System.out.println(array[i]+"");
    }
	}

}
