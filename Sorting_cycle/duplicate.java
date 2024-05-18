//3..................first duplicate element found

package Sorting_cycle;

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        
        int arr[] = {3,1,3,4,2};
        System.out.println(Cycle_Sort(arr));
    }

    static int Cycle_Sort(int arr[]){

        int i=0;
        while (i<arr.length) {
            

            if(arr[i] != i+1){

                int correct = arr[i]-1;

                if (arr[i] != arr[correct]) {
                    
                    swap(arr, i, correct);
                } 
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }

        }
        return -1;
    }

    static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
       }
}

