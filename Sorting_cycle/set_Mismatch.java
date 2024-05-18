/*
 You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

//4.................... 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 */

package Sorting_cycle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class set_Mismatch {
    public static void main(String[] args) {

        int nums[] = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        
    }

    public static int[] findErrorNums(int[] nums) {

        int i=0;
        while (i<nums.length) {
            
            int correct = nums[i]-1; // because here starting from the 1

            if (nums[i] != nums[correct]) {
                
                swap(nums, i, correct);
            } 
            else{
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return new int[] {nums[index], index+1};
            }
            
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
       }
}
