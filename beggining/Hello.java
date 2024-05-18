import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

        int num = 'b';
        System.out.println(num);

    }
}
