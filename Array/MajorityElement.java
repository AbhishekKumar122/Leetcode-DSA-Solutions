package Array;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }
}
