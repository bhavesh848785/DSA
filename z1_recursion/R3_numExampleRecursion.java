/*proper concept of recursion............

Recursion is the technique of making a function call itself. 
This technique provides a way to break complicated problems down into 
simple problems which are easier to solve.
*/


package z1_recursion;

public class R3_numExampleRecursion {
    public static void main(String[] args){

        number1(1);
    }

    static void number1(int n){

        if (n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);
        number1(n + 1);
    }

}

