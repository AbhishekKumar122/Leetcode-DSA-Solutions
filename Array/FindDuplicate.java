package Array;

import java.util.*;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        int ans = findDuplicate(nums);

        System.out.println(ans);
    }
}
