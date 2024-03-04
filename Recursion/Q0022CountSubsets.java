
// (30/01/2024, 23:07)
import java.util.*;
import java.lang.*;

public class Q0022CountSubsets {

    // QUES: COUNT SUBSETS RETURN LIST OF LIST
    static int subsets(int[] nums) {

        List<List<Integer>> rtn = new ArrayList<>();
        int dp[] = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        int ptr = 0;
        List<Integer> arr = new ArrayList<>();
        int ans = powerS(nums, arr, ptr, rtn, dp);

        System.out.println(rtn);
        return ans;

    }

    // powerS
    static int powerS(int[] nums, List<Integer> arr, int ptr, List<List<Integer>> rtn, int[] dp) {

        if (ptr >= nums.length) {
            rtn.add(new ArrayList<>(arr));
            return 1;
        }
        if (dp[ptr] != -1) {
            return dp[ptr];
        }
        // taking an element
        arr.add(nums[ptr]);
        int take = powerS(nums, arr, ptr + 1, rtn, dp);
        arr.remove(arr.size() - 1);

        // excluding element
        int notTake = powerS(nums, arr, ptr + 1, rtn, dp);

        dp[ptr] = take + notTake;
        return dp[ptr];

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        int ans = subsets(nums);
        System.out.println(ans);

    }
}
