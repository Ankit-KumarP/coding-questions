// (30/12/2023, 23:10)
// QUES: Sort List<List<Integer>> based on first diffrent element. If elements same then sort on basic on size;
package Java;

import java.util.*;
import java.lang.*;

public class Q007Comparator {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList());
        arr.add(Arrays.asList(12, 13));
        arr.add(Arrays.asList(12));
        arr.add(Arrays.asList(13));
        System.out.println(arr);
        Collections.sort(arr, new Sort());
        System.out.println(arr);
    }
}

class Sort implements Comparator<List> {
    public int compare(List a, List b) {
        int size = Math.min(a.size(), b.size());
        for (int i = 0; i < size; i++) {
            int com = (int) a.get(i) - (int) b.get(i);
            if (com != 0)
                return com;
        }
        return (int) a.size() - (int) b.size();
    }
}
