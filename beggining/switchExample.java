import java.util.Scanner;

public class switchExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        switch (str) {
            case "apple":
                System.out.println("red color");
                break;

            case "mango":
                System.out.println("yellow color");
                break;

            case "orange":
                System.out.println("orange color");
                break;
        
            default:
                break;
        }
    }
}