/*
 source to destination find game caled a maze.......

 not: only goes to down and right , not a left or up
 */

package z7_backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {

        System.out.println("//1st solution");
        System.out.println(count(3, 3));

        System.out.println("//2st solution");
        path("", 3, 3);

        System.out.println("//3st solution");
        System.out.println(pathRet("", 3, 3));

        System.out.println("//4st solution");
        System.out.println(pathRet_digonal("", 3, 3));

        System.out.println("//5st solution");
        boolean[][] board ={
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        path_obstacle("", board, 0, 0);
    }

    //how many ways to reach the destination
    static int count(int r, int c){
        if(r==1  || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    //print the maze path
    static void path(String p, int r, int c){
        if(r==1  && c==1){
            System.out.println(p);
            return;
       }

       if(r>1){
        path( p+ 'D', r-1, c);
       }

       if(c>1){
        path( p+ 'R', r, c-1);
       }
    }

    //retuen a array list
    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1  && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

    ArrayList<String> list = new ArrayList<>();

       if(r>1){
        list.addAll(pathRet( p+ 'D', r-1, c));
       }

       if(c>1){
        list.addAll(pathRet( p+ 'R', r, c-1));
       }

       return list;
    }


    //digonal possible solution in maze
    static ArrayList<String> pathRet_digonal(String p, int r, int c){
        if(r==1  && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

    ArrayList<String> list = new ArrayList<>();

       
       if(r>1){
        list.addAll(pathRet_digonal( p+ 'V', r-1, c));
       }

       if(c>1){
        list.addAll(pathRet_digonal( p+ 'H', r, c-1));
       }

       if(r>1 && c>1){
        list.addAll(pathRet_digonal( p+ 'D', r-1, c-1));
       }
       return list;
    }

        //maze with obstacle
        static void path_obstacle(String p, boolean[][] maze, int r, int c){
            if(r== maze.length - 1  && c== maze[0].length-1){
                System.out.println(p);
                return;
           }
    
           if(maze[r][c] == false){
            return;
           }

           if(r < maze.length-1){
            path_obstacle( p+ 'D', maze, r+1, c);
           }
    
           if(c < maze[0].length-1){
            path_obstacle( p+ 'R', maze, r, c+1);
           }
        }
}
