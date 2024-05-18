package sortings_1;

class Problem_2
{
    public static int nextGreatestLetter(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int nextLetter = nums[0]; // Initialize with the first letter
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1; // Continue search in the right half
            } else {
                nextLetter = nums[mid]; // Update next greatest letter
                right = mid - 1; // Continue search in the left half
            }
        }
        
        // If all nums are smaller than or equal to the target, return the first nums
        return nextLetter;
    }


public static void main (String args[])
{
    // char arr1[] = {'a', 'b'};
    // char key ='c';

    int arr1[] = {1,2,4,6,7};
    int key = 5;
    System.out.println(nextGreatestLetter(arr1,key));
}
}
