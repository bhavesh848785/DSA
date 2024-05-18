
// package sortings;

// public class Problem_6 {
//     public static void main(String[] args) {
        
//     }

//     static int findPivote(int[] arr){
//         int start =0;
//         int end = arr.length-1;

//         while (start<=end) {
//             int mid= start+(end -start)/2;

//             //4 cases over here

//             if(mid<end && arr[mid]>arr[mid+1]){
//                 return mid;
//             }

//             if(mid>start && arr[mid]<arr[mid-1]){
//                 return mid-1;
//             }


//             if(arr[mid]== arr[start] && arr[mid]== arr[end]){

//                 if(arr[start]> arr[start+1]){
//                     return start;
//                 }
//                 start++;

//                 if (arr[end]> arr[end-1]) {
//                     return end-1;
//                 }
//                 end--;
//             }

//             else if()
//         }
//         return -1;
//     }
// }
