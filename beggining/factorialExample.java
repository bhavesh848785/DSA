import java.util.Scanner;

public class factorialExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
         int fact=1;
        if(a<0)
        {
            System.out.println("factorial not for negative number");
        }

        else if(a==0){
            System.out.println("1");
        
        }

        else{
           
            for(int i=0; i<a; i++)
            {
                fact*=i+1;
            }
        }
        System.out.println(fact);


    }
}
