package threads;
import java.util.*;

public class PalindromeRemover {
    public static int charactersToRemove(String input1) {
        if (input1 == null || input1.length() == 0)
            return -1;

        // Convert to lowercase to ignore case
        String word = input1.toLowerCase();

        // Frequency map
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0)
                oddCount++;
        }

        if (oddCount == word.length()) {
            // All characters are unique => cannot form palindrome
            return -1;
        }

        // In a palindrome, only 1 odd character count is allowed (middle character in odd length)
        // So we must remove (oddCount - 1) characters
        return Math.max(0, oddCount - 1);
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(charactersToRemove("Template")); // Output: 3
        System.out.println(charactersToRemove("Magma"));    // Output: 0
        System.out.println(charactersToRemove("Victory"));  // Output: -1
    }
}