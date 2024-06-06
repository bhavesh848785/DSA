/*
 public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int n1 = 1;
        int k1 = 6;
        int target1 = 3;
        System.out.println("Test Case 1: " + solution.numRollsToTarget(n1, k1, target1)); // Expected output: 1

        // Test case 2
        int n2 = 2;
        int k2 = 6;
        int target2 = 7;
        System.out.println("Test Case 2: " + solution.numRollsToTarget(n2, k2, target2)); // Expected output: 6
    }
 */



package z6_recursion;

import java.util.HashMap;
import java.util.Map;

class DiceSum2{
public static void main(String[] args) {
        DiceSum2 solution = new DiceSum2();

        // Test case 1
        int n1 = 1;
        int k1 = 6;
        int target1 = 3;
        System.out.println("Test Case 1: " + solution.numRollsToTarget(n1, k1, target1)); // Expected output: 1

        // Test case 2
        int n2 = 2;
        int k2 = 6;
        int target2 = 7;
        System.out.println("Test Case 2: " + solution.numRollsToTarget(n2, k2, target2)); // Expected output: 6

        
        // Test case 3
        int n3 = 30;
        int k3 = 30;
        int target3 = 500;
        System.out.println("Test Case 3: " + solution.numRollsToTarget(n3, k3, target3)); // Expected output: 222616187
    }

    private static final int MOD = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return dice(n, k, target, memo);
    }
    private int dice(int n, int k, int target, Map<String, Integer> memo) {
        if (n == 0) {
            return target == 0 ? 1 : 0;
        }

        if (target <= 0) {
            return 0;
        }

        String key = n + "," + target;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int count = 0;
        for (int i = 1; i <= k && i <= target; i++) {
            count = (count + dice(n - 1, k, target - i, memo)) % MOD;
        }

        memo.put(key, count);
        return count;
    }
}
