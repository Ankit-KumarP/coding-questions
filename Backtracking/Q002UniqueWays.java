// (02/09/23), 11;00
package Backtracking;

import java.util.*;
import java.lang.*;

public class Q002UniqueWays {
    static int totalWays(int m, int n) {
        if (m == 0 && n == 0)
            return 1;
        int fst = 0;
        if(m > 0)
        fst = totalWays(m - 1, n);
        int scnd = 0;
        if(n > 0)
        scnd = totalWays(m, n - 1);
        return fst + scnd;
    }

    public static void main(String[] args) {
        int ans = totalWays(3-1, 7-1);
        System.out.println(ans);
    }
}
