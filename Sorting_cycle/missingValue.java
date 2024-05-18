//2...........................

package Sorting_cycle;

public class missingValue {
    
    public static void main(String[] args) {
        
        int nums[] = {4, 0, 2,1};
        System.out.println(missingNumber(nums));
    }

        public static int missingNumber(int[] nums) {
            
            int i=0;
            while (nums[i] < nums.length && i<nums.length) {
                
                int correct = nums[i]; // because here starting from the 0, {4, 0, 2,1}
    
                if (nums[i] != nums[correct]) {
                    
                    swap(nums, i, correct);
                } 
                else{
                    i++;
                }
            }

            //search for first missing number
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index) {
                    return index;
                }
                
            }

            //case 2
            return nums.length;
        }
    
        static void swap(int[] arr, int i, int correct) {
    
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
           }
    
    }

