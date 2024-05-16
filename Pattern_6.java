

/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

row:1     *     colum-1
row:2    **     colum-2
row:3   ***     colum-3
row:4  ****     colum-4
row:5 *****     colum-5


if i write with one space:  System.out.print("* ");
output be like:

   * 
  * *
 * * *
* * * *

*/

package pattern;

public class Pattern_6 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){

        for(int row =1; row<= n; row++){

            // Print spaces to align asterisks to the right
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            //for avery row, run the colum

            for (int col = 1; col<= row; col++) {
                System.out.print("*");
            }

            //when one row is printed , we need to add a newline
            System.out.println();
        }
    }
}
