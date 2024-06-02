/*

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

 */

package z5_recursion;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return (getStringBck(s)).equals(getStringBck(t));
    }

    public String getStringBck(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    result.append(s.charAt(i));
                }
            }
        }
        
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test cases
        System.out.println(sol.backspaceCompare("ab#c", "ad#c")); // Output: true
        System.out.println(sol.backspaceCompare("ab##", "c#d#")); // Output: true
        System.out.println(sol.backspaceCompare("a#c", "b"));    // Output: false
    }
}
