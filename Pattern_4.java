/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

row:1 1     have colum-1
row:2 12         colum-2
row:3 123        colum-3
row:4 1234       colum-4
row:5 12345      colum-5

*/


package pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){

        for(int row =1; row<= n; row++){
            //for avery row, run the colum

            for (int col = 1; col<= row; col++) {
                System.out.print(col);
            }

            //when one row is printed , we need to add a newline
            System.out.println();
        }
    }
}
