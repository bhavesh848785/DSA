/*
D_product(1342) = (1342 % 10) * D_product(134)
                = (2) * (134 % 10) * D_product(13)
                = 2 * (4) * (13 % 10) * D_product(1)
                = 2 * 4 * (3) * (1 % 10) * D_product(0)
                = 2 * 4 * 3 * (1) * 1 // Base case, recursion stops here
                = 24
 */

package z2_recursion;

public class digit_Product{
    public static void main(String[] args) {
        System.out.println(D_product(1342));
    }

    static int D_product(int n){
        if(n%10 == n){
            return n;
        }
        else{
            return (n % 10) * D_product(n / 10);
        }
    }
}
