
public class Q002FibonacciNumber {
// fibonacci number
	static int fibonacci(int n) {
		if(n <= 1) return n;
		return fibonacci(n-1) + fibonacci(n-2);

		// int left = fibonacci(n-1);
		// int right = fibonacci(n-2);
		// return left + right;
	}
	public static void main(String[] args) {
		int ans = fibonacci(7);
		System.out.println(ans);

	}

}
