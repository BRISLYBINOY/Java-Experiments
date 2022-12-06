import java.util.Scanner;
/**
 * 
 */

/**
 * @author cseb2
 *
 */
public class DisplayMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    		int matrix[][] = new int[10][10];
    System.out.println("Enter the no of rows:");
    int rows = scanner.nextInt();
    System.out.println("Enter the no of columns :");
    int columns = scanner.nextInt();
    System.out.println("Enter the"+rows*columns+"elements of the matrix");
    for(int i =0;i<rows;i++) 
    {
      for (int j=0;j<columns;j++)
      {
    	  matrix[i][j]=scanner.nextInt();
      }
    }
    System.out.println("The entered matrix is displayed below:");
    for(int i=0; i<rows;i++)
    {
    	for(int j=0; j<columns; j++)
    	{
    		System.out.println(matrix[i][j] + " ");
    	}

     }System.out.println();
    }
}
