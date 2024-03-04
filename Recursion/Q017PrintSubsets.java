
// (30/08/23), 22:12
import java.util.*;
import java.lang.*;

public class Q017PrintSubsets {
    // QUES: PRINT SUBSETS RETURN LIST OF LIST
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rtn = new ArrayList<>();
        int ptr = 0;
        List<Integer> arr = new ArrayList<>();
        powerS(nums, arr, ptr, rtn);
        return rtn;
    }

    // powerS
    static void powerS(int[] nums, List<Integer> arr, int ptr, List<List<Integer>> rtn) {

        if (ptr == nums.length) {
            if (!rtn.contains(arr)) {
                rtn.add(new ArrayList<>(arr));
            }
            return;
        }
        // taking an element
        arr.add(nums[ptr]);
        powerS(nums, arr, ptr + 1, rtn);
        arr.remove(arr.size() - 1);

        // excluding element
        powerS(nums, arr, ptr + 1, rtn);
    }

    public static void main(String[] args) {
        List<List<Integer>> rtn = new ArrayList<>();
        int nums[] = { 1, 2, 2 };
        rtn = subsets(nums);
        System.out.println(rtn);
    }
}
