//sorted array: [0,1,2....]
//unsorted array: [5,6,7.8.9.....]

package sortings_2;

import java.util.Arrays;

public class insertionSort {
    
    public static void main(String[] args) {
        
        int num[] = {2,1,3,5,6,0};
        insertion(num);
        System.out.println(Arrays.toString(num));
        // System.out.println(Arrays.toString(bubble(num)));
    }

     static void insertion(int[] num) {
        
        for(int i=0; i<num.length-1; i++){
            for(int j= i+1; j>0; j--){
                
                if (num[j] < num[j-1]) {

                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }

                else{
                    break;
                }
            }
        }
    }
}
