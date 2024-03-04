package Backtracking;

import java.util.*;
import java.lang.*;

public class Q004PathDiagonal {
    // QUES: UNIQUE PATH IF GO DIGONALLY ALSO
    static int paths(int m, int n) {

        if (m == 1 || n == 1) {
            return 1;
        }
        int down = paths(m - 1, n);
        int right = paths(m, n - 1);
        int diagonal = paths(m - 1, n - 1);
        return down + right + diagonal;
    }

    public static void main(String[] args) {
        int ans = paths(3, 3);
        System.out.println(ans);
        System.out.println("Ankit Kumar");

    }

}
