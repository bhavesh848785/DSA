/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

row:1 ****       colum-4
row:2 ***        colum-3
row:3 **         colum-2
row:4 *          colum-1

*/

package pattern;

public class Pattern_3 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row=1; row <=n; row++)
        {
            for (int col = 1; col<= n-row+1; col++) {
                System.out.print("* ");
            }

              //when one row is printed , we need to add a newline
              System.out.println();
            }
    }
}
