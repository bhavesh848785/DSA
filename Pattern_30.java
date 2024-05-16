
/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

must check the diffrenece between print and println

*/

package pattern;

public class Pattern_30 {
    
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for(int row=1; row<=n; row++){

            for(int space=0; space<n-row; space++){
                System.out.print("  ");
            }

            for(int col = row; col>=1; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col<=row; col++){
                System.out.print(col + "  ");
            }

            System.out.println();
        }
    }
}
