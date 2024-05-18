public class next {

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] + intArray[j] == target) {
                    System.out.println("Output: [" + i + ", " + j + "]");
                    found = true;  
                }
            }
        }

        if(!found){
        System.out.println("No solution found.");
        }
    }
}
