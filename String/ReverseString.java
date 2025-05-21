package String;

public class ReverseString {
    public static String reverseString(String s) {
        char[] sChar = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = sChar[left];
            sChar[left] = sChar[right];
            sChar[right] = temp;

            left++;
            right--;
        }

        return new String(sChar);

    }

    public static void main(String[] args) {
        String s = "hello";

        System.out.println(reverseString(s));
    }
}
