import java.util.Scanner;

public class UpperandLower {
    public static void main (String args[])
    {
        Scanner hi = new Scanner(System.in);
        char ch = hi.next().trim().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("Lowercae");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
