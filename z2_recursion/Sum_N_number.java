/*
 factorial 
 
 fact(5) = 5 + fact(4)
        = 5 + (4 + fact(3))
        = 5 + (4 + (3 + fact(2)))
        = 5 + (4 + (3 + (2 + fact(1))))
        = 5 + (4 + (3 + (2 + 1)))
        = 5 + (4 + (3 + 3))
        = 5 + (4 + 6)
        = 5 + 10
        = 15
 */
package z2_recursion;

public class Sum_N_number {
    public static void main(String[] args) {
        System.out.println(sum_n(5));
    }

    static int sum_n(int n){
        if(n<=1){
            return 1;
        }

        else{
            return n + sum_n(n - 1);
        }
    }
}
