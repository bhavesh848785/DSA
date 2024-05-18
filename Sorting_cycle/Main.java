

package Sorting_cycle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Swift array: var swiftArray = [1, 2, 3, 4, 5]
        // Equivalent Java ArrayList:
        ArrayList<Integer> javaArrayList = new ArrayList<>();
        javaArrayList.add(1);
        javaArrayList.add(2);
        javaArrayList.add(3);
        javaArrayList.add(4);
        javaArrayList.add(5);

        // Accessing elements:
        // Swift: let element = swiftArray[2]
        // Java:
        int element = javaArrayList.get(2);
        System.out.println("Element at index 2: " + element);

        // Modifying elements:
        // Swift: swiftArray[3] = 10
        // Java:
        javaArrayList.set(3, 10);
        System.out.println("Modified ArrayList: " + javaArrayList);

        // Iterating through elements:
        // Swift:
        // for item in swiftArray {
        //     print(item)
        // }
        // Java:
        System.out.println("Iterating through ArrayList:");
        for (int i = 0; i < javaArrayList.size(); i++) {
            System.out.println(javaArrayList.get(i));
        }
    }
}
