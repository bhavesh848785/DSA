
/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

row:1 *     have colum-1
row:2 **         colum-2
row:3 ***        colum-3
row:4 ****       colum-4
row:5 *****      colum-5
row:6 ****       colum-4
row:7 ***        colum-3
row:8 **         colum-2
row:9 *          colum-1


here n=5 then how many rows: 2n-1 =9

2 * n - row (decrement the colum)

*/

package pattern;

public class Pattern_5 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row=0; row< 2*n; row++){

            int totalColumInRow = row > n ? 2 * n - row : row;

            for (int col = 0; col < totalColumInRow; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
