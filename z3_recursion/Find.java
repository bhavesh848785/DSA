//find a element

package z3_recursion;

import java.util.ArrayList;
import java.util.List;

import sortings_2.insertionSort;

public class Find {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 6, 7};
        int target = 5;
        System.out.println(find(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexLast(arr, target, arr.length-1));

        findAllIndex(arr, target, 0);
        System.out.println(list);

        System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));

        System.out.println(findAllIndex2(arr, target, 0));
    }
    //1. true or false
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr [index] == target || find(arr, target, index + 1);
    }

    //2. return index from first
    static int findIndex(int [] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;   
        }
        else{
            return findIndex(arr, target, index + 1);
        }
    }

    //3. return the target index number from searching start with the last

    static int findIndexLast(int [] arr, int target, int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;   
        }
        else{
            return findIndexLast(arr, target, index - 1);
        }
    }


    //4. find all index using ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr [], int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr, target, index+1);
    }

    //5. return the arraylist as a argument
    static ArrayList<Integer> findAllIndex(int arr [], int target, int index, ArrayList<Integer> list ){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, index+1, list);
    }

        //6. return the arraylist
        static ArrayList<Integer> findAllIndex2(int arr [], int target, int index){

            ArrayList<Integer> list= new ArrayList<>();

            if(index == arr.length){
                return list;
            }
    
            //this will contain answer only for that function call
            if(arr[index] == target){
                list.add(index);
            }
            ArrayList<Integer> ansFromBelowAll = findAllIndex2(arr, target, index+1);
            list.addAll(ansFromBelowAll);
            return list;
        }
}
