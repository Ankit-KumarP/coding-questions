// (24/08/23), 21:43
package Recursion;
import java.util.*;
public class Q009Pattern {
// patternI
	static void patternI(int n) {
		for(int i = n;i > 0;i--) {
			for(int j = 0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
//	patternR
	static void pattern(int n) {
		if(n == 0) return;
		for(int i = 0;i<n;i++)
			System.out.print("* ");
		pattern(n-1);
	}
	
//	patternR2
	static void patternR2(int n, int ptr) {
		if(n == 0) {
			return;
		}
		if(n > ptr) {
//			System.out.print("* ");
			patternR2(n,ptr+1);
			System.out.print("* ");
		}
		else {
//			System.out.println();
			patternR2(n-1,0);
			System.out.println();
		}
//		System.out.println("OK ");
	}
	
	public static void main(String[] args) {
//		patternI(4);
//		patternR(4);
		patternR2(3,0);

	}

}
