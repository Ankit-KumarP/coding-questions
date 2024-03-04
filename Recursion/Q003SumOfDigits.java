import java.util.*;
import java.lang.*;
public class Q003SumOfDigits {
//sum of digit
	static int sum (int n) {
		if(n == 0) return 0;
		int digit = n % 10;
		int newNum = n / 10;
		return sum(newNum) + digit;
	}
	public static void main(String[] args) {
		int ans = sum(0);
		System.out.println(ans);

	}

}
