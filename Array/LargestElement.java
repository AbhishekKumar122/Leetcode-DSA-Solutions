package Array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 8, 5, 9 };
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
}
