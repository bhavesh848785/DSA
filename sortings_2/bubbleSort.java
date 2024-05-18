package sortings_2;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        
        int num[] = {2,1,3,5,6,0};
        bubble(num);
        System.out.println(Arrays.toString(num));
        // System.out.println(Arrays.toString(bubble(num)));
    }

static void bubble(int arr[]){//     static int[] bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) { // passes 1, 2,3,4.....
            
            for (int j = 1; j < arr.length-i; j++) { // actually swap the element 
                
                if (arr[j] < arr[j-1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
