import java.util.*;
import java.lang.*;
public class Q00Array1 {
//	isSorted
	static boolean isSorted(int [] arr, int n, int idx) {
		if(idx == n-1) return true;
		if(arr[idx] > arr[idx+1]) return false;
		return isSorted(arr,n,idx+1);
	}
	public static void main(String[] args) {
		int [] arr = {1,5,7,8,9,10};
		boolean ans = isSorted(arr,arr.length,0);
		System.out.println(ans);

	}

}
