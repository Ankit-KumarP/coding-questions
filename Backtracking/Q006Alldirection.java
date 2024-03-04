// (07/09/23), 18:29
package Backtracking;

import java.util.*;
import java.lang.*;

public class Q006Alldirection {
    // QUES: CAN MOVE IN ALL DIRECTION
    static int ways(int[][] grid, int m, int n, int ptr1, int ptr2) {
        if (ptr1 == m && ptr2 == n) {
            return 1;
        }
        if (grid[ptr1][ptr2] == 1) {
            return 0;
        }

        grid[ptr1][ptr2] = 1;
        int left = 0;
        if (ptr2 > 0) {
            left = ways(grid, m, n, ptr1, ptr2 - 1);
        }
        int right = 0;
        if (ptr2 < n) {
            right = ways(grid, m, n, ptr1, ptr2 + 1);
        }
        int up = 0;
        if (ptr1 > 0) {
            up = ways(grid, m, n, ptr1 - 1, ptr2);
        }
        int down = 0;
        if (ptr1 < m) {
            down = ways(grid, m, n, ptr1 + 1, ptr2);
        }
        grid[ptr1][ptr2] = 0;
        return (left + right + up + down);
    }

    public static void main(String[] args) {
        int[][] grid = {

                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }

        };
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        int ptr1 = 0;
        int ptr2 = 0;
        int ans = ways(grid, m, n, ptr1, ptr2);
        System.out.println(ans);
    }
}
