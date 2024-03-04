
// (29-08-23), 20:58 | 03/09/23, 19:54
import java.util.*;
import java.lang.*;

public class Q15PrintSubstring {
    // QUES: PRINT ALL SUBSEQUENCES
    static void subsequences(String s, String sb, int idx) {

        // base condition
        if (idx == s.length()) {
            System.out.println(sb);
            return;
        }

        // taking
        char temp = s.charAt(idx);
        subsequences(s, sb + temp, idx + 1);

        // not taking
        subsequences(s, sb, idx + 1);

    }

    public static void main(String[] args) {
        String s = "1,2,3";
        String sb = "";
        subsequences(s, sb, 0);

    }
}
