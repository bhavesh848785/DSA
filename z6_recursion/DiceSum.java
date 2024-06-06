
/*
dice sum like dice have a...1,2,3,4,5,6
how many pairs get sum 4?
output is:
1111
112
121
13
211
22
31
4
*/

package z6_recursion;

public class DiceSum {
    public static void main(String[] args) {
        dice("", 4);
    }

    static void dice(String p, int target){
        if(target== 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i <= 6 && i <= target; i++){
            dice(p+i, target-i);
        }
    }
}
