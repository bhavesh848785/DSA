 
/* 

............... Find in Mountain Array................

Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
*/

package sortings_1;

public class Problem_5 {

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(arr, target));
    }
    


    static int search(int [] arr, int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if(firstTry!= -1){
            return firstTry;
        }

        else{
            return orderAgnosticBS(arr, target, peak+1, arr.length-1);
        }

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



    static int orderAgnosticBS(int[] arr, int target, int start, int end)
    {
       boolean isAsc = arr[start]<arr[end];

        while (start<=end)
        {
            int mid = start+ (end -start)/2;


            if(arr[mid]==target)
            {return mid;}
            
            if(isAsc){
                if(target<arr[mid])
               {end = mid-1;}
               else
               {start = mid +1;}
            }

            else{
                if(target>arr[mid])
               {end = mid-1;}
               else
               {start = mid +1;}
            }
        }
        return -1;
    }

}