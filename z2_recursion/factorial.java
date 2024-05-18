/*
 factorial 
 
 fact(5) = 5 * fact(4)
        = 5 * (4 * fact(3))
        = 5 * (4 * (3 * fact(2)))
        = 5 * (4 * (3 * (2 * fact(1))))
        = 5 * (4 * (3 * (2 * 1)))
        = 5 * (4 * (3 * 2))
        = 5 * (4 * 6)
        = 5 * 24
        = 120
 */
package z2_recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }

        else{
            return n * fact(n - 1);
        }
    }
}
