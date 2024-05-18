// searching in sorted matrix of 2D Binary array 


package sortings_1;

import java.util.Arrays;

class Binary_2D {

    public static void main(String[] args) {
        int[][] arr= {

            //here row wise and colum wise data increment
            //means some order maintained here
            //then and then only posiible

                    {10, 20, 30, 40},
                    {15, 25, 35},
                    {28, 29, 37, 49},
                    {33, 34, 38, 50}     
                    
                    //n*n, n*m, m*n
        };
       
        System.out.println(Arrays.toString(matrixSearch(arr, 35)));
    }


    static int[] matrixSearch(int[][] matrix, int target){
        int r=0;
        int c = matrix.length - 1;

        while (r< matrix.length && c>=0) {
            System.out.println("Current indices: [" + r + ", " + c + "]");


            if (matrix[r][c]== target) {
                return new int[] {r, c};
            }

            if(matrix[r][c] < target){
                r++;
            }

            else{
                c--;
            }
        }

        return new int[]{-1, -1};
    }
}