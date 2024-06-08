
package z7_backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] b = new int[][] {       
                { 7, 0, 0, 0, 0, 0, 2, 0, 0 },   
                { 4, 0, 2, 0, 0, 0, 0, 0, 3 },   
                { 0, 0, 0, 2, 0, 1, 0, 0, 0 },   
                { 3, 0, 0, 1, 8, 0, 0, 9, 7 },   
                { 0, 0, 9, 0, 7, 0, 6, 0, 0 },   
                { 6, 5, 0, 0, 3, 2, 0, 0, 1 },   
                { 0, 0, 0, 4, 0, 9, 0, 0, 0 },   
                { 5, 0, 0, 0, 0, 0, 1, 0, 6 },   
                { 0, 0, 6, 0, 0, 0, 0, 0, 8 } 
            } ;  

        if (solve(b)) {
            display(b);
        }else{
            System.out.println("cannot solved");
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //this is how we are replacing with r, c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                } 
            }

            //if you found some empty element in row, the break
            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;
            //sudoku is solved here
        }

        //backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    //found the ans
                    return true;
                }
                else{
                    //backtrack
                    board[row][col] =0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }



    static boolean isSafe(int[][] board, int row, int col, int num){
        //check the row
        for(int i=0; i<board.length; i++){
            //chech the number is in the row
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;   
            }
        }

        int sqrt =(int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }

        return true;
    }
    
}
