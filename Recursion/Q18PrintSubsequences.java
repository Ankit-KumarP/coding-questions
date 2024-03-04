
// (03/09/23), 22:19
import java.util.*;
import java.lang.*;

public class Q18PrintSubsequences {
    // QUES: PRINT SUBSEQUENCES OF AN ARRAY
    static void subsequences(int[] nums, int ptr, ArrayList arr) {

        // base case
        if (ptr == nums.length) {
            System.out.println(arr);
            return;
        }

        // taking element
        arr.add(nums[ptr]);
        subsequences(nums, ptr + 1, arr);
        arr.remove(arr.size() - 1);

        // not taking
        subsequences(nums, ptr + 1, arr);

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        int ptr = 0;
        ArrayList arr = new ArrayList<>();
        subsequences(nums, ptr, arr);
    }
}
