//https: //leetcode.com/problems/letter-combinations-of-a-phone-number/

package z6_recursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padret("", "12"));
        System.out.println(pad_count("", "12"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //this will onvert '2' to 2

        for(int i = (digit - 1) * 3; i < digit * 3; i++){

            char ch = (char) ('a'+ i);
            pad(p+ch, up.substring(1));
        }
    }

    //using arraylist
    static ArrayList<String> padret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //this will onvert '2' to 2

        ArrayList<String> list = new ArrayList<>(); 

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a'+ i);
            list.addAll(padret(p+ch, up.substring(1)));
        }
        return list;
    }

    // count
    static int pad_count(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; //this will onvert '2' to 2

        for(int i = (digit - 1) * 3; i < digit * 3; i++){

            char ch = (char) ('a'+ i);
            count = count + pad_count(p+ch, up.substring(1));
        }
        return count;
    }
}
