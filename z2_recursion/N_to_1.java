package z2_recursion;

public class N_to_1 {
    public static void main(String[] args) {
        fun(5);
        funRev(5);
    }
// n to 1

/*fun(5)
  -> prints 5
  -> fun(4)
    -> prints 4
    -> fun(3)
      -> prints 3
      -> fun(2)
        -> prints 2
        -> fun(1)
          -> prints 1
          -> fun(0) // base case, recursion stops here
 */
    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }

    
// 1 to n
/*funRev(5)
  -> funRev(4)
    -> funRev(3)
      -> funRev(2)
        -> funRev(1)
          -> funRev(0) // base case, recursion stops here
          -> prints 1
        -> prints 2
      -> prints 3
    -> prints 4
  -> prints 5
 */
    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
