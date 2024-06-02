package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars {
    public static void main(String[] args) {
        // Test cases
        String[] words1 = {"bella", "label", "roller"};
        String[] words2 = {"cool", "lock", "cook"};

        System.out.println(commonChars(words1)); // Output: ["e", "l", "l"]
        System.out.println(commonChars(words2)); // Output: ["c", "o"]
    }

    public static List<String> commonChars(String[] words) {
        // Initialize the frequency counter for the first word
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {
            int[] charCount = new int[26];

            // Count the frequency of each character in the current word
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Update the minFreq to keep track of the minimum frequency of each character
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }

        // Collect the common characters based on the minFreq counter
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }
}
