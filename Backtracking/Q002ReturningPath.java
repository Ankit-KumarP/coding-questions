// (02/09/23), 20:44
package Backtracking;

import java.util.*;
import java.lang.*;

public class Q002ReturningPath {
    // QUES: RETURN ALL PATHS IN ARRAYLIST
    static void paths(int m, int n, String s, List<String> rtn) {

        if (m == 1 && n == 1) {
            rtn.add(new String(s));
            return;
        }
        if (m != 1)
            paths(m - 1, n, s + "D", rtn);
        if (n != 1)
            paths(m, n - 1, s + "R", rtn);

    }

    public static void main(String[] args) {
        List<String> rtn = new ArrayList<>();
        int m = 3, n = 3;
        String sb = "";
        paths(m, n, sb, rtn);
        System.out.println(rtn);
    }
}
