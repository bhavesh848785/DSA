/*
10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 */

package z1_recursion;

public class R4_upto_10_sum {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k){
        if(k>0){

            /*repeat until k=0
              but if you write:
              return k + (k - 1); 
              it print only 19 because run only one time so
              use the callit self known as a recursion*/

            return k + sum(k - 1); 
        }else{
            return 0;
        }
    }
}
