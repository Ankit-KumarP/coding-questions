public class Ultimate {

    // Ques 1: TOTAL NO. OF PATH
    static int path(int[][] grid, int m, int n) {

        if (m == 0 && n == 0)
            return 1;
        if (grid[m][n] == 1)
            return 0;
        grid[m][n] = 1;
        int up = 0;
        if (m > 0)
            up = path(grid, m - 1, n);
        int down = 0;
        if (m < grid.length - 1)
            down = path(grid, m + 1, n);
        int left = 0;
        if (n > 0)
            left = path(grid, m, n - 1);
        int right = 0;
        if (n < grid[0].length - 1)
            right = path(grid, m, n + 1);
        grid[m][n] = 0;
        return up + down + left + right;

    }

    // QUES 2: PRINT PATHS
    static void print(int[][] grid, int m, int n, String s) {

        if (m == 0 && n == 0) {
            System.out.println(s);
            return;
        }
        if (grid[m][n] == 1)
            return;
        grid[m][n] = 1;
        if (m > 0)
            print(grid, m - 1, n, s + "U");
        if (m < grid.length - 1)
            print(grid, m + 1, n, s + "D");
        if (n > 0)
            print(grid, m, n - 1, s + "L");
        if (n < grid[0].length - 1)
            print(grid, m, n + 1, s + "R");
        grid[m][n] = 0;
    }

    // QUES 3: MIN SUM
    static int minSum(int[][] grid, int m, int n) {

        if (m == 0 && n == 0)
            return 1;
        if (grid[m][n] == 1)
            return 0;
        grid[m][n] = 1;
        int up = 0;
        if (m > 0)
            up = path(grid, m - 1, n);
        int down = 0;
        if (m < grid.length - 1)
            down = path(grid, m + 1, n);
        int left = 0;
        if (n > 0)
            left = path(grid, m, n - 1);
        int right = 0;
        if (n < grid[0].length - 1)
            right = path(grid, m, n + 1);
        grid[m][n] = 0;
        return up + down + left + right;

    }

    public static void main(String[] args) {
        int[][] grid = {

                { 2, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }

        };
        int m = grid.length;
        int n = grid[0].length;
        int ans = path(grid, m - 1, n - 1);
        System.out.println(ans);
        System.out.println();
        print(grid, m - 1, n - 1, "");
    }
}
