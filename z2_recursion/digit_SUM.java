/*
 D_sum(1342) = (1342 % 10) + D_sum(134)
            = (2) + (134 % 10) + D_sum(13)
            = 2 + (4) + (13 % 10) + D_sum(1)
            = 2 + 4 + (3) + (1 % 10) + D_sum(0)
            = 2 + 4 + 3 + (1) + 0 // Base case, recursion stops here
            = 10

 */
package z2_recursion;

public class digit_SUM {
    public static void main(String[] args) {
        System.out.println(D_sum(1342));
 
   }

    static int D_sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n % 10) + D_sum(n / 10);
        }
    }
}
