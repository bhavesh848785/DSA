//position of an element in infinite sorted array


package sortings_1;

public class Problem_3 {

    public static void main(String[] args) {
        
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));
    }

    //.............................................
    static int ans(int [] arr, int target)
    {
        //first find the range
        //fisrt start the box size 2

        int start=0;
        int end = 1;

        //condition for checking target lie in range or not

        while (target>arr[end])
        {
            int newStart = end +1;
            
            //double the box size means end = previous end + sizebox*2

            int newEnd = end + (end-start+1)*2;
            start= newStart;
            end =newEnd;
        }

        return search(arr, target, start, end); 
    }
    
    //........................................
    static int search (int[] arr, int target, int start, int end)
    {

        while (start<=end)
        {
            int mid = start+ (end -start)/2;
            
            if(target<arr[mid])
               { end = mid-1;}

           else if(target>arr[mid])
               {start = mid +1;}

            else{return mid;}
        }
        return -1;
    }

}
