package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static String longestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLen = 0;
        int start = 0; // Start index of the longest substring
        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring without repeating characters: " + longestSubstring(s));
    }

}
