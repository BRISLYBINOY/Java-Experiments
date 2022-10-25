import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
          System.out.println("Enter number of rows in matrix : ");
          int rows = scanner.nextInt();
          System.out.print("Enter number of columns in matrix : ");
          int columns = scanner.nextInt();

          int matrix[][] = new int[rows][columns];

          System.out.println("Enter the elements in matrix :");
          for (int i = 0; i < rows; i++) {
                 for (int j = 0; j < columns; j++) {
                       matrix[i][j] = scanner.nextInt();
                 }
          }
         
         
          int transpose[][] = new int[columns][rows];
          for (int i = 0; i < rows; i++) {
                 for (int j = 0; j < columns; j++)
                       transpose[j][i] = matrix[i][j];
          }

          System.out.println("\nEntered Matrix is : ");
          for (int i = 0; i < rows; i++) {
                 for (int j = 0; j < columns; j++) {
                       System.out.print(matrix[i][j] + " ");
                 }
                 System.out.println();
          }

         
          System.out.println("\nTranspose of entered matrix is : ");
          for (int i = 0; i < columns; i++) {
                 for (int j = 0; j < rows; j++) {
                       System.out.print(transpose[i][j] + " ");
                 }
                 System.out.println();
          }
   }
	}
