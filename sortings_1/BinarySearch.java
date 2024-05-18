// class BinarySearchExample{  
//     public static void binarySearch(int arr[], int first, int last, int key){  
//       int mid = (first + last)/2;  
//       while( first <= last ){  
//          if ( arr[mid] < key ){  
//            first = mid + 1;     
//          }else if ( arr[mid] == key ){  
//            System.out.println("Element is found at index: " + mid);  
//            break;  
//          }else{  
//             last = mid - 1;  
//          }  
//          mid = (first + last)/2;  
//       }  
//       if ( first > last ){  
//          System.out.println("Element is not found!");  
//       }  
//     }  
//     public static void main(String args[]){  
//            int arr[] = {10,20,30,40,50};  
//            int key = 30;  
//            int last=arr.length-1;  
//            binarySearch(arr,0,last,key);     
//     }  
//    }  


package sortings_1;

public class BinarySearch
{
    public static void binarysearchf(int []arr, int first, int last, int key)
    {
        int mid = (last + first)/2;

        while(first<=last)
        {
            if(arr[mid]<key)
            {
                first = mid +1;
            }    

            else if (arr[mid]==key)
            {
                System.out.println("key found at index:" + mid); 
                break;   
            }

            else
            {
                last = mid-1;
                for(int j=0; j<arr.length; j++)
                {
                    if(arr[j]>key)
                    {
                        System.out.println(arr[j]);
                        break;
                    }
                    
                }
                
            }

            mid = (first+last)/2;
            

        }
        
        if(first>last)
        {
            System.out.println("not found");
        }
    }


    public static void main (String args[])
    {
        int arr1[] = {10,20,40,50,10};
        int key =30;
        int last = arr1.length-1;
        binarysearchf(arr1, 0, last, key);
    }
}






//................................binary search.............................//

// package sortings;

// public class BinarySearch
// {
//     public static void binarysearchf(int []arr, int first, int last, int key)
//     {
//         int mid = (last + first)/2;

//         while(first<=last)
//         {
//             if(arr[mid]<key)
//             {
//                 first = mid +1;
//             }    

//             else if (arr[mid]==key)
//             {
//                 System.out.println("key found at index:" + mid); 
//                 break;   
//             }

//             else
//             {
//                 last = mid-1;
//             }

//             mid = (first+last)/2;

//             for(int j=0; j<arr.length; j++)
//             {
//                 if(arr[j]>key)
//                 {
//                     System.out.println(arr[j]);
//                     break;
//                 }
                
//             }
//         }



//     }


//     public static void main (String args[])
//     {
//         int arr1[] = {10,20,40,50,10};
//         int key =30;
//         int last = arr1.length-1;
//         binarysearchf(arr1, 0, last, key);
//     }
// }



// package sortings;

// public class BinarySearch
// {
//     public static void binarysearchf(int []arr,int key)
//     {


//         for (int j = 0; j<arr.length; j++)
//         {
            
//             if (arr[j]==key)
//             {
//               System.out.println(arr[j]);   
//             }
            
//             if(arr[j]>key)
//             {
//                 System.out.println(arr[j]);
//                 break;
//             }
//         }
//     }


//     public static void main (String args[])
//     {
//         int arr1[] = {10,20,40,50,10};
//         int key =30;
//         binarysearchf(arr1,key);
//     }
// }



// package sortings;

// public class BinarySearch {
//     public static int findCeiling(int[] arr, int key) {
//         int low = 0;
//         int high = arr.length - 1;
//         int ceiling = -1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (arr[mid] == key) {
//                 return mid;
//             } else if (arr[mid] < key) {
//                 low = mid + 1;
//             } else {
//                 ceiling = mid;
//                 high = mid - 1;
//             }
//         }

//         return ceiling;
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 20, 40, 50, 60};
//         int key = 30;

//         int ceilingIndex = findCeiling(arr, key);
//         if (ceilingIndex != -1) {
//             System.out.println("Ceiling of " + key + " is at index: " + ceilingIndex + ", value: " + arr[ceilingIndex]);
//         } else {
//             System.out.println("No ceiling found for " + key);
//         }
//     }
// }










//..........................binary...............................//

// package sortings;

// public class Problem_3 {
    
//     static int search (int[] nums, int target)
//     {
//         int ans = -1;
//         int start =0;
//         int end = nums.length-1;

//         while (start<=end)
//         {
//             int mid = start+ (end -start)/2;
            
//             if(target<nums[mid])
//                { end = mid-1;}

//            else if(target>nums[mid])
//                {start = mid +1;}

//             else{return mid;}
//         }
//         return ans;
//     }

// }
