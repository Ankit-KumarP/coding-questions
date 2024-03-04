// (12/02/2024, 09:08am)
// QUESTION:
// Find the three largest element in an array, in one iteration;
package Java;

import java.util.*;
import java.lang.*;

public class Q009ThreeLargestNo {
    public static void main(String[] args) {
        // int arr[] = { 1, 90, 87, 2, 32, 34, -1, 78, 50, 89 };
        int arr[] = { 56, 86, 78, 43, 5 };
        int first = -1, second = -1, third = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            third = Math.max(arr[i], third);
            if (third > second) {
                third = third + second;
                second = third - second;
                third = third - second;
            }
            if (second > first) {
                int temp = second;
                second = first;
                first = temp;
            }
        }
        System.out.println(first + " " + second + " " + third);
    }
}
