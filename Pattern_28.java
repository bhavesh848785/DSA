
/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *


here n=5 then how many rows: 2n-1 =9

2 * n - row (decrement the colum)

must check the diffrenece between print and println

*/

package pattern;

public class Pattern_28 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row=0; row< 2*n; row++){

            int totalColumInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n-totalColumInRow;

            for(int s=0; s<noOfSpaces; s++){
                System.out.print(" ");
            }

            for (int col = 0; col < totalColumInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
