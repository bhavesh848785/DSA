
/*
all "a" are removed from the string
 */


package z5_recursion;


public class Stream {
    public static void main(String[] args) {
        // a remove from the string
        skip(" ", "baccadh");

        // a remove from the string
        String result1 = skip1("baccadh");
        System.out.println(result1); // Output: " bccdh"

        // skip apple from the string
        String result2 = skipAPPLE("bccappledh");
        System.out.println(result2); // Output: "bccdh"

        // skip or delete app when not a apple 
        String result3 = skip_APP_not_APPLE("bccappledh");
        System.out.println(result3); // Output: "bccdh"
    }
    

    // a remove from the string
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch=='a') {
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }
        // a remove from the string
        static String skip1(String up){
            if(up.isEmpty()){
                return " ";
            }

            char ch = up.charAt(0);

            if (ch=='a') {
                return skip1(up.substring(1));
            }
            else{
                return ch + skip1(up.substring(1));
            }
        }

        //skip apple from the string
        static String skipAPPLE(String up){
            if(up.isEmpty()){
                return " ";
            }
            if (up.startsWith("apple")) {
                return skipAPPLE(up.substring(5));
            }
            else{
                return up.charAt(0) + skipAPPLE(up.substring(1));
            }
        }

        //skip or delete app when not a apple 
        static String skip_APP_not_APPLE(String up){
            if(up.isEmpty()){
                return " ";
            }
            if (up.startsWith("app") && !up.startsWith("apple")) {
                return skip_APP_not_APPLE(up.substring(3));
            }
            else{
                return up.charAt(0) + skipAPPLE(up.substring(1));
            }
        }

}
