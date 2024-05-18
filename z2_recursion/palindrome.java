package z2_recursion;

public class palindrome {
    public static void main(String[] args) {
        int number = 12321; // Example number
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    static int reversed = 0;

    static boolean isPalindrome(int n) {
        int originalNumber = n;
        return reverseAndCheckPalindrome(n, originalNumber);
    }

    static boolean reverseAndCheckPalindrome(int n, int originalNumber) {
        if (n == 0) {
            return originalNumber == reversed;
        } else {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            return reverseAndCheckPalindrome(n / 10, originalNumber);
        }
    }
}

