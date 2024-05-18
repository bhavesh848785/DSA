package z2_recursion;

public class reverse {
    public static void main(String[] args) {

        // revers(1234);
        // System.out.println(sum); //if using void
        System.out.println(revers(1234));
    }

    static int sum=0;
    static int revers(int n){
        if(n==0){
            return 0;
        }
        else{
            int rem = n % 10;
            sum = sum * 10 + rem;
            revers(n / 10);
            return sum;
        }
    }
}
