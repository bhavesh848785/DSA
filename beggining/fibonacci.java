import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        // int count = 2;
        int temp;

        for(int i=0; i<n; i++)
        {
        // while (count<=n) {
            System.out.println(a);
            // int temp = b;
            temp = a+b;
            a= b;
            b = temp;
            // count++;
            
            // System.out.println(b);
        }
    }
}
// }
