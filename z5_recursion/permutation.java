/* 
how many ways to arrange "abc" string......
output is :

cba
bca
bac
cab
acb
abc

*/ 

package z5_recursion;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        //recursive
        permutations("", "abc");


        //recursive with arraylist
        ArrayList<String> ans =  permutations_2("", "abc");
        System.out.println(ans);

        //count the , how many ways?
        System.out.println(permutations_count("", "abc"));
    }

    static void permutations(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<= p.length(); i++){

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }

   // using array list
    static ArrayList<String>permutations_2(String p, String up){
        if (up.isEmpty()) {

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
           return list;
        }
    

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();


        for(int i=0; i<= p.length(); i++){

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations_2(f+ch+s, up.substring(1)));
        }

        return ans;
    }


    static int permutations_count(String p, String up){
        if (up.isEmpty()) {
            // System.out.println(p);
            return 1;
        }

        int count = 0;
        
        char ch = up.charAt(0);
        for(int i=0; i<= p.length(); i++){

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutations_count(f+ch+s, up.substring(1));
        }

        return count;
    }

}