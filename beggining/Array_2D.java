import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("enter the size of row: ");
        int row = in.nextInt();

        System.out.println("enter the size of colum: ");
        int colum = in.nextInt();

        int[][] twoD = new int[row][colum];


        int value=1;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < colum; j++)
            {
                twoD[i][j] = value; //(i + 1) * (j + 1);
                value++;    
            }    
        }

        for (int i = 0; i < row; i++)
        {
            // for (int j = 0; j < colum; j++)
            // {
            //    System.out.println(twoD[i][j]+ " ");  
            // }    
            System.out.println(Arrays.toString(twoD[i]));

            //System.out.println();
        }
	}
}
