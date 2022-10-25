import java.util.Scanner;
public class DisplayMatrix {
   public static void main(String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   int matrix[][]= new int[10][10];
	   System.out.println("Enter the number of rows:");
	   int rows = scanner.nextInt();
	   System.out.println("Enter the number of columns:");
	   int columns = scanner.nextInt();
	   System.out.println("Enter the" +rows*columns+ "elements of the matrix");
	   for(int i=0; i<rows;i++)
	   {
		   for(int j=0; j<rows;j++)
		   {
			   matrix[i][j] = scanner.nextInt();
		   }
	   }
	   System.out.println("The entered matrix is displayed below");
	   for(int i=0; i<rows;i++)
	   {
		   for(int j=0; j<rows;j++)
		   {
			   System.out.print(matrix[i][j] + " ");
		   }System.out.println();
   }
}
}