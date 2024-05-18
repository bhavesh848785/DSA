package strings;

public class S4_palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        
        if(str== null || str.length()==0){
            return true;
        }

        str = str.toLowerCase();
      

        for (int i = 0; i < str.length(); i++) {
            
            char start = str.charAt(i); // 0(a), 1(b)....
            char end = str.charAt(str.length()-1-i); // 4(a), 3(b)....
           
            if(start!= end){
                return false;
            }
        }
        return true;
    }
}
