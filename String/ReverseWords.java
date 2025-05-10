package String;

public class ReverseWords {
    public static String revString(String s) {
        String words[] = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);

            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";

        String ans = revString(s);
        System.out.println(ans);
    }
}
