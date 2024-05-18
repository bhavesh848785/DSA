package strings;

import java.util.ArrayList;

public class S2_Operator {
    public static void main(String[] args) {
        
        System.out.println('a' + 'b');

        System.out.println("a" + "b");

        System.out.println('a' + 3);

        System.out.println((char)('a' + 3));

        System.err.println("a" +1);
        //this is same as after a few steps: "a" + "1"
        //integer will be converted to Integer that will call toString()

        System.out.println("bhavesh" + new ArrayList<>());

        System.out.println("bhavesh" + new Integer(40));

        //+ operator
        String ans = new Integer(40)+ "" + new ArrayList<>();
        System.out.println(ans);
    }   
}
