package z7_backtracking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class All_Path_Print {
    public static void main(String[] args) {
        boolean[][] board ={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        int path[][] = new int[board.length][board[0].length];
        all_path_print("", board, 0, 0, path, 1);
    }

        //maze with all the paths
        static void all_path_print(String p, boolean[][] maze, int r, int c, int[][] path, int steps){
            if(r== maze.length - 1  && c== maze[0].length-1){
              path[r][c] = steps;
                for(int[] arr: path){
                  System.out.println(Arrays.toString(arr));
                }

                System.out.println(p);
                System.out.println();
                return;
           }
    
           if(maze[r][c] == false){
            return;
           }

           // i am considering this block in my path
           maze[r][c] = false;
           path[r][c] = steps;

           if(r < maze.length-1){
            all_path_print( p+ 'D', maze, r+1, c, path, steps+1);
           }
    
           if(c < maze[0].length-1){
            all_path_print( p+ 'R', maze, r, c+1, path, steps+1);
           }

           if (r > 0) {
             all_path_print(p+ 'U', maze, r-1, c, path, steps+1);
           }

           if (c > 0) {
            all_path_print(p+ 'L', maze, r, c-1, path, steps+1);
          }


          //this line is where the function will be over
          //so before the function gets, removed also remove the changes that were made by that function
          maze[r][c] = true;
          path[r][c] = 0;
        }
}
