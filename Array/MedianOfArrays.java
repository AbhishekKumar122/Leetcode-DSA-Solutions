package Array;

import java.util.Arrays;

public class MedianOfArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int merged[] = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int j = 0; j < m; j++) {
            merged[k++] = nums2[j];
        }

        Arrays.sort(merged);

        int total = merged.length;

        if (total % 2 == 1) {// if odd
            return (double) merged[total / 2];
        } else { // if even
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];

            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2 };
        int nums2[] = { 3, 4 };

        MedianOfArrays obj = new MedianOfArrays();

        double result = obj.findMedianSortedArrays(nums1, nums2);

        System.out.println(result);

    }
}
