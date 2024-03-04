// (15/11/2023, 7:19AM)
package Java;

import java.util.*;
import java.lang.*;

// SortByEndTime
class SortByEndTime implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        int endTime =  a[1] - b[1];
        int startTime = a[0] - b[0];
        if(endTime == 0) return startTime;
        else return endTime;
    }
}

public class Q004Compartor {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 2 },
                { 23, 0 },
                { 1, 5 },
                { 1, 2 },
                { 5, 9 }
        };
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        Arrays.sort(arr, new SortByEndTime());
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
