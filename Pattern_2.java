/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

row:1 *     have colum-1
row:2 **         colum-2
row:3 ***        colum-3
row:4 ****       colum-4

*/


package pattern;

public class Pattern_2 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){

        for(int row =1; row<= n; row++){
            //for avery row, run the colum

            for (int col = 1; col<= row; col++) {
                System.out.print("* ");
            }

            //when one row is printed , we need to add a newline
            System.out.println();
        }
    }
}
