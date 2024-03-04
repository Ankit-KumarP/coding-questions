// (15/11/2023, 7:03AM)
// QUES: SORTING THE LIST ACCRODING TO THE LAST DIGIT.
package Java;

import java.util.*;
import java.lang.*;

// SortByLastDigit
class SortByLastDigit implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return (a % 10) - (b % 10);
    }
}

public class Q003Comparator {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(21);
        arr.add(76);
        arr.add(28);
        arr.add(10);
        System.out.println(arr);

        // 1st
        // Collections.sort(arr);
        // System.out.println(arr);

        // 2nd
        Collections.sort(arr, new SortByLastDigit());
        System.out.println(arr);
    }
}
