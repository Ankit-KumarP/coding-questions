// (07/09/23), 20:23
package Backtracking;

import java.util.*;
import java.lang.*;

public class Q007Alldirection {
    // QUES: PRINT PATHS ALLOW TO MOVE IN ALL DIRECTION
    static void paths(int[][] grid, int m, int n, String str, List<String> rtn) {

        // base case
        if (m == grid.length - 1 && n == grid[0].length - 1) {
            rtn.add(str);
            return;
        }
        if (grid[m][n] == 1)
            return;
        grid[m][n] = 1;
        if (n < grid[0].length - 1) {
            paths(grid, m, n + 1, str + 'R', rtn);
        }
        if (n > 0) {
            paths(grid, m, n - 1, str + 'L', rtn);
        }
        if (m < grid.length - 1) {
            paths(grid, m + 1, n, str + 'D', rtn);
        }
        if (m > 0) {
            paths(grid, m - 1, n, str + 'U', rtn);
        }
        grid[m][n] = 0;
    }

    public static void main(String[] args) {
        int[][] grid = {

                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }

        };
        List<String> rtn = new ArrayList<>();
        paths(grid, 0, 0, "", rtn);
        System.out.println(rtn);
    }
}
