public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();  // Create an instance of the Solution class
        int[] nums = {2, 7, 6, 3};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
