
// (29/08/23), 22:09
import java.util.*;
import java.lang.*;

public class Q16PrintSubstring2 {
    // QUES: PRINT ALL SUBSEQUENCE
    static void subsequence(String s, String rtn, int ptr, List<String> arr) {

        // base condition
        if (ptr == s.length()) {
            if (rtn.isEmpty())
                return;
            arr.add(rtn);
            return;
        }
        // taking
        rtn = rtn + s.charAt(ptr);
        subsequence(s, rtn, ptr + 1, arr);
        rtn = rtn.substring(0, rtn.length() - 1);

        // not taking
        subsequence(s, rtn, ptr + 1, arr);
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        String rtn = "";
        int ptr = 0;
        String s = "123";
        subsequence(s, rtn, ptr, arr);
        System.out.println(arr);
    }
}
