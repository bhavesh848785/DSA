



/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
      4 3 2 1 2 3 4
        3 2 1 2 3
          2 1 2
            1

must check the diffrenece between print and println

*/

package pattern;

public class Pattern_17 {
    
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for(int row=1; row<=n; row++){

            int totalColumInRow = row > n ? 2 * n - row : row;

            for(int space=0; space<n-totalColumInRow; space++){
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


/*static void pattern(int n){
        for(int row=0; row< 2*n; row++){

            int totalColumInRow = row > n ? 2 * n - row : row;

            for (int col = 0; col < totalColumInRow; col++) {
                System.out.print("*");
            }

            System.out.println();
        } */