package Array;

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            if (lastSmaller == nums[i]) {
                continue;
            }
            if (nums[i] - 1 == lastSmaller) {
                count++;
            } else {
                count = 1;
            }
            lastSmaller = nums[i];
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int nums[] = { 100, 4, 200, 1, 3, 2 };

        int result = longestConsecutive(nums);

        System.out.println(result);
    }
}
