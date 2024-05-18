//max element find first and set as last...lsat....last

package sortings_2;

import java.util.Arrays;

public class selectionSort {
    
     public static void main(String[] args) {
        
        // int num[] = {2,1,3,5,6,0};
        int num[] = {0,1,2,3,4,5,6};
        selection(num);
        System.out.println(Arrays.toString(num));
        // System.out.println(Arrays.toString(bubble(num)));
    }

     static void selection(int[] num) {
        
        for(int i=0; i<num.length; i++){
            
            //find the max item in the remaining array and swap with the currect index

            int last = num.length - i - 1;
            int maxIndex = getMaxIndex(num, 0, last);

            int temp = num[maxIndex];
            num[maxIndex] = num[last];
            num[last] = temp;
        }
    }

    private static int getMaxIndex(int[] num, int start , int end) {
        
        int max = start;
        for(int i=start; i<=end; i++){
                if(num[max] < num[i]){
                    max =i;
                }

        }

        return max;
    }
}
