package Recursion;

public class Q001PrintNumber {
//	tail recursion ( operation while calling the functions )
	static void printT(int n) {
		if(n == 5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printT(n+1);
	}
	
//	head recursion
	static void printH(int n) {
		if(n == 5) {
			System.out.println(n);
			return;
		}
		 printH(n+1);
		System.out.println(n);
//		System.out.println("Hello");
	}

	public static void main(String[] args) {
//		printT(1);
		printH(1);

	}

}
