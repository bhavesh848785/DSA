/*
 subset of abc = [ abc,  ab,  ac,  a,  bc,  b,  c,  ]
 */


package z5_recursion;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        sub_sequence(" ", "abc");
        ArrayList<String> result = subsequence_return(" ", "abc");
        System.out.println(result);
        sub_sequence_ascii(" ", "abc");
    }
    // normal way
    static void sub_sequence(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sub_sequence(p + ch , up.substring(1));
        sub_sequence(p, up.substring(1));
    }


    //using array list
    static ArrayList<String> subsequence_return(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence_return(p+ ch, up.substring(1));
        ArrayList<String> right = subsequence_return(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    // also ascii value
    static void sub_sequence_ascii(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sub_sequence_ascii(p + ch , up.substring(1));
        sub_sequence_ascii(p, up.substring(1));
        sub_sequence_ascii(p + (ch+0), up.substring(1));
    }
}
