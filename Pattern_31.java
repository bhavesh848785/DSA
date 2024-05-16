/*1: no. of lines = no. of rows = no. of times outer loop will run

2: identify for avery row no., 
--> how many colums are there
--> types of element in colum (ex., 1, * etc....)

31.      4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4  

any element: distance:

left= col       up = row
right= N-col    down = N-row

must check the diffrenece between print and println

*/

package pattern;

public class Pattern_31 {
    
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        int original =n; //original n means 4
        n = 2*n;
        for(int row=0; row<=n; row++){
            for(int col=0; col<=n; col++){

                // int EveryIndex = Math.min(Math.min(row, col), Math.min(n-row, n-col));
             /* 0 0 0 0 0 0 0 0 0 
                0 1 1 1 1 1 1 1 0
                0 1 2 2 2 2 2 1 0
                0 1 2 3 3 3 2 1 0
                0 1 2 3 4 3 2 1 0
                0 1 2 3 3 3 2 1 0
                0 1 2 2 2 2 2 1 0
                0 1 1 1 1 1 1 1 0
                0 0 0 0 0 0 0 0 0 */

                int EveryIndex = original - Math.min(Math.min(row, col), Math.min(n-row, n-col));

            /*4 4 4 4 4 4 4 4 4 
                4 3 3 3 3 3 3 3 4
                4 3 2 2 2 2 2 3 4
                4 3 2 1 1 1 2 3 4
                4 3 2 1 0 1 2 3 4
                4 3 2 1 1 1 2 3 4
                4 3 2 2 2 2 2 3 4
                4 3 3 3 3 3 3 3 4
                4 4 4 4 4 4 4 4 4 */
                System.out.print(EveryIndex + " ");
            }
            System.out.println();
        }
    }
}
