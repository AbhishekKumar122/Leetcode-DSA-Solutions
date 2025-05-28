package Array;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res = nums.length; // start with 'n'

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i]; // accumulate the difference
        }

        return res;
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int nums[] = { 3, 1, 0, };
        int ans = obj.missingNumber(nums);

        System.out.println(ans);

    }
}
