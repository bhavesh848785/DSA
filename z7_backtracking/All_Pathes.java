package z7_backtracking;

public class All_Pathes {
    public static void main(String[] args) {
        boolean[][] board ={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        all_path("", board, 0, 0);
    }

        //maze with all the paths
        static void all_path(String p, boolean[][] maze, int r, int c){
            if(r== maze.length - 1  && c== maze[0].length-1){
                System.out.println(p);
                return;
           }
    
           if(maze[r][c] == false){
            return;
           }

           // i am considering this block in my path
           maze[r][c] = false;

           if(r < maze.length-1){
            all_path( p+ 'D', maze, r+1, c);
           }
    
           if(c < maze[0].length-1){
            all_path( p+ 'R', maze, r, c+1);
           }

           if (r > 0) {
             all_path(p+ 'U', maze, r-1, c);
           }

           if (c > 0) {
            all_path(p+ 'L', maze, r, c-1);
          }


          //this line is where the function will be over
          //so before the function gets, removed also remove the changes that were made by that function
          maze[r][c] = true;
        }
}
