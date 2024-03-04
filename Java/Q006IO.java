
// (05/12/2023, 14:30)
package Java;

import java.util.*;
import java.lang.*;

public class Q006IO {
    public static void main(String args[]) {
        System.out.println("Integer, Float, Decimal, Char, 3 Strings");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        // sc.next();
        char c = sc.next().charAt(0);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(i + " " + f + " " + " " + d + " " + c + " " + str1 + " " + str2 + " ");
    }
}