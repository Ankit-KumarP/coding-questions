// Description
// Problem Statement

// You are given a string s of length n. You want to find all the distinct non-empty strings that can be formed from s such that:

// No two adjacent characters from the string s are chosen in the string that we make from s.
// Since the answer can be large print it modulo 10^9+7.

// Input Format

// The only line of input contains a string s.
// Constraints

// 1 <= n <= 10^5
// Output Format

// Return an integer as asked.
// Evaluation Parameters

// Sample Input
// dd
// Sample Output
// 1

import java.util.*;
import java.lang.*;

public class Q023Subsets {

    // function 1
    public static int subset(String s) {

        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        List<String> rtn = new ArrayList<>();
        total(s, 0, "", rtn);
        System.out.println(rtn);
        return rtn.size();

    }

    public static void total(String s, int ptr, String st, List<String> rtn) {

        if (ptr >= s.length()) {
            if (!rtn.contains(st) && st != "")
                rtn.add(new String(st));
            return;
        }
        total(s, ptr + 2, st + s.charAt(ptr), rtn);
        total(s, ptr + 1, st, rtn);
    }

    public static void main(String[] args) {
        String str = "dd";
        int ans = subset(str);
        System.out.println(ans);
    }
}
