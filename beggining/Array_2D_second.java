import java.util.Arrays;
import java.util.Scanner;
//import java.util.*;

public class Array_2D_second {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("enter the size of row: ");
        int row = in.nextInt();

        System.out.println("enter the size of colum: ");
        int colum = in.nextInt();

        int[][] twoD = new int[row][colum];


        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < colum; j++)
            {
                System.out.print("Enter the element for index (" + i + ", " + j + "): ");
                twoD[i][j] = in.nextInt();  
            }    
        }

        for (int i = 0; i < row; i++)
        {
            // for (int j = 0; j < colum; j++)
            // {
            //    System.out.println(twoD[i][j]+ " ");  
            // }    
            System.out.println(Arrays.toString(twoD[i]));

            // System.out.println();
        }
	}
}




// import java.util.Scanner;

// public class Array_2D_second {
// 	public static void main(String[] args)
// 	{
// 		Scanner scan = new Scanner(System.in);

// 		System.out.print("Enter number of rows: ");
// 		int rows = scan.nextInt();

// 		System.out.print("Enter number of columns: ");
// 		int columns = scan.nextInt();

// 		int[][] multidimensionalArray= new int[rows][columns];

// 		// Now you can use the array like a regular
// 		// 2-dimensional array
// 		for (int i = 0; i < rows; i++) {
// 			for (int j = 0; j < columns; j++) {
// 				multidimensionalArray[i][j]= (i + 1) * (j + 1);
// 			}
// 		}
// 		for (int i = 0; i < rows; i++) {
// 			for (int j = 0; j < columns; j++) {
// 				System.out.print(multidimensionalArray[i][j]+ " ");
// 			}

// 			System.out.println();
// 		}
// 		scan.close();
// 	}
// }
