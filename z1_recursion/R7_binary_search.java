// in future use put into the argument 
// otherwise put into the body
// make sure to return the result of a function of the return type


package z1_recursion;

public class R7_binary_search {
    public static void main(String[] args) {

        int arr[] = {23,24,25,26,27,28};
        int target = 24;
        int s= 0;
        int e= arr.length-1;
        System.out.println(binary_s(arr, target, s, e));
        
    }

    static int binary_s(int arr[], int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s+ (e - s) /2;

        if(arr[m] == target){
            return m;
        }
        if (target > arr[m]) {
            return binary_s(arr, target, m+1, e);
        }
        return binary_s(arr, target, s, m-1);
   }
}
