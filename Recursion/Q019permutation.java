
// (01/09/23), 19:25
import java.util.*;
import java.lang.*;

public class Q019permutation {
    // QUES: FIND PERMUTATION OF ARRAY
    static void permutation(int[] nums, int[] frq, ArrayList<Integer> arr) {
        // base case
        if (arr.size() == nums.length) {
            System.out.println(new ArrayList<>(arr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (frq[i] != 1) {
                arr.add(nums[i]);
                frq[i] = 1;
                permutation(nums, frq, arr);
                frq[i] = 0;
                arr.remove(arr.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        int[] frq = new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<>();
        permutation(nums, frq, arr);
        System.out.println("DONE");
    }
}
