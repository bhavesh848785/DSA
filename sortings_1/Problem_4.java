//program: peak index in a mountain array 

//mountain array means first incresing and then decresing (biotanic array)


package sortings_1;

public class Problem_4 {

    public static void main(String[] args) {

        int arr[] = {10,20,30, 50, 20,10,5};
        System.out.println(peakIndexInMountainArray(arr));
        
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while (start<end) {
            int mid = start+ (end-start) /2;

            if (arr[mid]>arr[mid+1]) {
            //you are in the dec part of the array
            // this may be the ans but look at left
            //this is why end! = mid-1
            end = mid; 
            }

            else{

            //you are in the asc part of the array
                start = mid+1; //
            }
        }

        return start;
    }
}


