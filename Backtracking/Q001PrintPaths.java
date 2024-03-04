package Backtracking;

import java.util.*;
import java.lang.*;

public class Q001PrintPaths {
    // PRINT UNIQUE POTHS OF GRIUD
    static void paths(int m, int n, String s) {

        if (m == 1 && n == 1) {
            System.out.println(s);
            return;
        }
        if (m != 1)
            paths(m - 1, n, s + "D");
        if (n != 1)
            paths(m, n - 1, s + "R");

    }

    public static void main(String[] args) {
        String sb = new String("");
        paths(3, 2, sb);
        System.out.println(sb);
    }
}
