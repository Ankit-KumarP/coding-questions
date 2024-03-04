
// (01/09/23), 19:22
import java.util.*;
import java.lang.*;

public class Q020permutation {
    // QUES: PRINT PERMUTATION WITHOUT USING FREQUENCY ARRAY.
    // swap
    static void swap(int[] arr, int l, int h) {
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }

    // permutation
    static void permutation(int nums[], int ptr) {

        // base case
        if (ptr == nums.length - 1) {
            List<Integer> rtn = new ArrayList<>();
            for (int i : nums) {
                rtn.add(i);
            }
            System.out.println(rtn);
            return;
        }
        for (int i = ptr; i < nums.length; i++) {
            swap(nums, i, ptr);
            permutation(nums, ptr + 1);
            swap(nums, i, ptr);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int ptr = 0;
        permutation(nums, ptr);
    }
}
