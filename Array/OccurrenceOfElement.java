package Array;

public class OccurrenceOfElement {

    public static void main(String[] args) {
        int nums[] = { 3, 5, 2, 3, 7, 3, 9, 5 };
        int target = 5;

        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}