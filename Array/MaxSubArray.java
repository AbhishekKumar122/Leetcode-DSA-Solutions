package Array;

public class MaxSubArray {

    public static int MaxSubArray(int nums[]) {
        int result = nums[0];
        int sum = 0;

        for (int n : nums) {
            if (sum < 0) {
                sum = 0;
            }

            sum += n;
            result = Math.max(result, sum);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 4, -1, 2, 1 };

        int ans = MaxSubArray(nums);

        System.out.println(ans);
    }
}
