//Prime or not (2, 3, 5, 7……)


import java.util.Scanner;

public class primeORnot {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(primeChecking(num)){
                System.out.println("number is prime");
                 
        }
        else{   
            System.out.println("number is not a prime");
        }
        
    }

    static boolean primeChecking(int n){

        if(n<2){
            return false;
        }

        for(int i=2; i<=n/2; i++){  // i=2 to i=1 (3/2=1)
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}

/*Let's understand with some examples:

If n = 7:

It's not less than 2, so it proceeds to the loop.
The loop iterates from i = 2 to i = 3 (inclusive).
At i = 2, 7 % 2 is not 0, so it continues.
At i = 3, 7 % 3 is not 0, so it continues.
Since there are no divisors in the range [2, 3], it returns true, indicating that 7 is a prime number.
If n = 8:

It's not less than 2, so it proceeds to the loop.
The loop iterates from i = 2 to i = 4 (inclusive).
At i = 2, 8 % 2 is 0, so it returns false, indicating that 8 is not a prime number. */