package Array;

public class RotateArray {

    public static void rotate(int nums[], int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 6, 4, 5 };
        int k = 2;

        rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}