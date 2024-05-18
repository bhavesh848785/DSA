//153 = (1*1*1)+(5*5*5)+(3*3*3)
//    =  153


import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(checkArmStrong(num));
    }

    static boolean checkArmStrong(int n){

        int original= n;
        int sum=0;

        while (n>0) {
            int rem= n%10;
            n= n/10;
            sum =sum + (rem*rem*rem);
        }
        if(sum==original){
            return true;
        }
        return false;
    }
    
}
