// (04/09/23), 19:47
package Backtracking;

import java.util.*;
import java.lang.*;

public class Q00PrintPaths {
    // QUES: ALLOW TO MOVE IN DOWN , RIGHT, AND IN ONE CORNER PRINT PATHS 
    static void paths(int m, int n, String s) {

        if (m == 1 && n == 1) {
            System.out.print(s + " ");
            return;
        }
        if (m > 1)
            paths(m - 1, n, s + 'D');
        if (n > 1)
            paths(m, n - 1, s + 'R');
        if (m > 1 && n > 1)
            paths(m - 1, n - 1, s + 'C');
    }

    public static void main(String[] args) {
        paths(3, 3, "");

    }
}
