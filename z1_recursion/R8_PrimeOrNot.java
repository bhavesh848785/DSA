package z1_recursion;

public class R8_PrimeOrNot {
    public static void main(String[] args) {
        int n=20;
        for (int i=1; i<=n; i++) {
            System.out.println(i+ " " + prime(i));
        }
    }

    static boolean prime(int n){
        if(n<=1){
            return false;
        }

        int c =2;
        while (c*c <= 2) {
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
