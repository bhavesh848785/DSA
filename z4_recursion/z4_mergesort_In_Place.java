/* 
 https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/14-recursion/Merge%20Sort.pdf
*/


package z4_recursion;

import java.util.Arrays;

public class z4_mergesort_In_Place {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        mergeIN_place(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeIN_place(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s + e)/2;

        mergeIN_place(arr, s, mid);
        mergeIN_place(arr, mid, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int m, int e){
        int mix[] = new int[e - s];

        int i=s;
        int j=m;
        int k=0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible one ofthe array not completed

        while (i< m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j<e) {
            mix[k] = arr[j];
            j++;
            k++;
        }   
        for (int l =0 ; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
