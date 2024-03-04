// (20/08/23) , 19.32
package Recursion;

public class Q004Infinite {
// function : 1
	static void print(int n) {
		if(n == 0) return;
		System.out.println(n);
		print(n--);
	}
	public static void main(String[] args) {
		print(5);

	}

}
