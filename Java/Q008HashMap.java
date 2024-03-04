package Java;

import java.util.*;
import java.lang.*;

// QUES:  SORT THE HASHMAP BASED ON VALUES.
public class Q008HashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 4);
        hm.put(3, 1);
        hm.put(5, 0);
        hm.put(1, 98);
        System.out.println(hm);

        // sorting
        List<Map.Entry<Integer, Integer>> arr = new ArrayList<>(hm.entrySet());
        Collections.sort(arr, new Sort());
        LinkedHashMap<Integer, Integer> lm = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> h : arr) {
            lm.put(h.getKey(), h.getValue());
        }
       System.out.println(lm);

    }
}

// Sort
class Sort implements Comparator<Map.Entry<Integer, Integer>> {
    public int compare(Map.Entry<Integer, Integer> h1, Map.Entry<Integer, Integer> h2) {
        int val1 = h1.getValue();
        int val2 = h2.getValue();
         if(val1 == val2){
            return h1.getKey() - h1.getKey();
        }
        else return val1-val2;
    }
}


