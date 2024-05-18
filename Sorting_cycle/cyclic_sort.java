//when a given number from range 1 to N, => use cyclic sort (most imp note)
// index = value-1;
// not dupicate alloweds

package Sorting_cycle;

import java.util.Arrays;

public class cyclic_sort{
    public static void main(String[] args) {
        
        int arr[] = {3, 5, 2, 1, 3, 4, 5};
        Cycle_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cycle_Sort(int arr[]){

        int i=0;
        while (i<arr.length) {
            
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
       }


}

