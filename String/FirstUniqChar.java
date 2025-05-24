
package String;

public class FirstUniqChar {

    public int firstUniqChar(String s) {
        int length = s.length();
        int counts[] = new int[26];

        // First pass: count character frequencies
        for (int i = 0; i < length; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        // Second pass: find the first unique character
        for (int i = 0; i < length; i++) {
            if (counts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        FirstUniqChar obj = new FirstUniqChar();

        int ans = obj.firstUniqChar(s);

        System.out.println(ans);
    }
}