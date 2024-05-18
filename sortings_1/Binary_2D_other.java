//must be stricly sorted


package sortings_1;

import java.util.Arrays;

public class Binary_2D_other {

    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(Arrays.toString(search(arr, 5)));
    }


    // search in the row provided between colum provided
    static int[] B_search(int[][] matrix, int row, int cStart, int cEnd, int target){
        if (cStart<=cEnd) {
            
            int mid = cStart + (cEnd - cStart)/2;

            if (matrix[row][mid] == target) {
                return new int[] {row, mid};
            }

            if (matrix[row][mid] < target) {
                cStart = mid +1;
            }else{
                cEnd = mid-1;
            }
        }

        return new int[] {-1, -1};
    }



    //..............................................................

    static int[] search(int matrix[][], int target){

        int row = matrix.length;
        int colum = matrix[0].length;

        if(row == 1){
            return B_search(matrix, 0, 0, colum-1,target);
        }

        int rStart = 0;
        int rEnd = row-1;
        int cMid = colum/2;

        //run the loop till 2 row are remaining
        while (rStart < (rEnd-1)) { // while this is true it will have more than 2 rows
            
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[] {mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                    rStart = mid;
            }

            else{
                rEnd = mid;
            }
        }


        // now w check two rows
        //ckeck whether the target is in the col of 2 rows

        if(matrix[rStart][cMid] == target){
            return new int[] {rStart, cMid};
        }

        if(matrix[rStart+1][cMid] == target){
            return new int[] {rStart+1, cMid};
        }


        //search in 1st half
        if (target <= matrix[rStart][cMid-1]) {
            return B_search(matrix, rStart, 0, cMid-1 ,target);
        }

        //search in 2st half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][colum-1] ) {
            return B_search(matrix, rStart, cMid+1, colum-1 ,target);
        }


        //search in 3st half
        if (target <= matrix[rStart+1][cMid-1]) {
            return B_search(matrix, rStart+1, 0, cMid-1, target);
        }


        else{
            return B_search(matrix, rStart+1, cMid+1, colum-1, target);
        }

    }
    
}
