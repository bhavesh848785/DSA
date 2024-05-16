/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *


must check the diffrenece between print and println

*/
package pattern;
public class Pattern_29 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        // Loop through each row
        for (int row = 1; row <= 2 * n - 1; row++) {
            // Declare and initialize variables that helps to print Butterfly pattern
            // int space = row <= n ? 2 * n - 2 * row + 1 : 2 * row - 2 * n + 1;

            int space;
            if (row < n) {
                space = 2 * n - 2 * row + 1;
            } else if (row == n) {
                space = 0; // When row == n, set space to 0
            } else {
                space = 2 * row - 2 * n + 1;
            }
            
            int star = row <= n ? row : 2 * n - row;

            // Use for loop to print star
            for (int m = 1; m <= star; m++) {
                System.out.print("*");
            }

            // Use for loop to print space
            for (int s = 3; s <= space; s++) { //check s=1,2,3,4....
                System.out.print(" ");
            }

            // Use for loop to print star for special case
            for (int p = 1; p <= star; p++) {
                if (p != n) {
                    System.out.print("*");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
