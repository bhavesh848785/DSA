//2..........find all numbers disappeared in an Array

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

//array  []
// index [0,1,2,3,4,5,6,7]
// value [1,2,3,4,3,2,7,8] --> [5,6] missing

package Sorting_cycle;

import java.util.ArrayList;
import java.util.List;

public class missingValue2 {
    public static void main(String[] args) {
        
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i=0;
        while (i<nums.length) {
            
            int correct = nums[i] - 1; //because starting with 1 [1,2,3,4,3,2,7,8]

            if (nums[i] != nums[correct]) {
                
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

            //just find missing number
            List<Integer> ans = new ArrayList<>(); 
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1) {
                    ans.add(index+1);
                }
            }

            //case 2
            return ans;
        }
    
        static void swap(int[] arr, int i, int correct) {
    
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
           }
    
    }

