// (20/08/23), 20.50
package Recursion;
import java.util.*;
import java.lang.*;
public class Q006CountZero {
// count zero
	static int countZero(int n, int count) {
		if(n == 0) return count;
		int rem = n % 10;
		if(rem == 0) return countZero(n/10,count+1);
		else return countZero(n/10,count);
	}
	public static void main(String[] args) {
		int ans = countZero(1010,0);
		System.out.println(ans);

	}

}
