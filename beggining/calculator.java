import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int ans=0;

        while (true)
        {
            System.out.println("enter che operator"); 
            char op = in.next().trim().charAt(0);

            if (op=='+' || op=='-' || op== '*' || op=='/' || op=='%')
            {

                System.out.println("enter the numbers:");
                int num1= in.nextInt();
                int num2= in.nextInt();
                
                if (op=='+')
                {
                    ans = num1+num2;
                }

                if (op=='-')
                {
                    ans = num1-num2;
                }

                if (op=='*')
                {
                    ans = num1*num2;
                }

                if (op=='/')
                {
                    if (num2!=0)
                    {
                        ans = num1/num2;
                    }
                }

                if (op=='%')
                {
                    ans = num1%num2;
                }
            } else if(op=='X' || op =='x')
                {
                    break;
                }

                else{
                    System.out.println("inavlid operator");
                }
               System.out.println(ans);
        }
        
    }
}
