//(20/08/23) , 19.39
package Recursion;

public class Q005reverseANumber {
//	reversing
	static int sum = 0;
	static void reverse(int n ) {
		if(n == 0) return;
		int num = n % 10;
		sum = sum * 10 + num;
		reverse(n/10);
	}

	public static void main(String[] args) {
		reverse(1234);
		System.out.println(sum);
	
			
	}

}
