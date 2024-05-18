//3............find all the duplicate value from the n value: 4,3,2,7,8,2,3,1

package Sorting_cycle;

import java.util.ArrayList;
import java.util.List;

public class duplicateAll {

    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

        public static List<Integer> findDuplicates(int[] arr) {
        
            int i=0;
            while (i<arr.length) {
    
                    int correct = arr[i]-1;
    
                    if (arr[i] != arr[correct]) {
                        
                        swap(arr, i, correct);
                    } 
                    else{
                        i++;
                    }
                }

    
              //just find missing number
              List<Integer> ans = new ArrayList<>(); 
              for (int index = 0; index < arr.length; index++) {
                  if (arr[index] != index+1) {
                      ans.add(arr[index]);
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
