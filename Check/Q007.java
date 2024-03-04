// (03/11/2023, 13:40)
package Check;

import java.util.*;
import java.lang.*;

public class Q007 {
    public static void main(String[] args) {

        // int digit = (int) Math.log10(123) + 1;
        // System.out.println(digit);
        // int bits = (int) (Math.log(8) / Math.log(2)) + 1;
        // System.out.println(bits);
        // int value = Integer.parseInt("123456789");
        // System.out.println(value);
        // int value2 = Integer.parseInt("1111", 2);
        // System.out.println(value2);
        // int n = (int) (Math.log10(81) / Math.log10(3));
        // double n2 = Math.log10(81) / Math.log10(3);
        // System.out.println(n == n2);
        // int x = Integer.numberOfLeadingZeros(9);
        // System.out.println(x);
        // int x2 = Integer.numberOfTrailingZeros(9);
        // System.out.println(x2);
        // String s1 = "Heello";
        // String s2 = "z";
        // System.out.println(s1.compareTo(s2));
        int [] arr = {1,3,4};
        int element = Arrays.binarySearch(arr, 4);
        System.out.println(element);


    }

}