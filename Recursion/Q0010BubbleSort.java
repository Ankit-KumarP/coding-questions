// (24/08/23), 22:26
import java.util.*;
import java.lang.*;
public class Q0010BubbleSort {
// bubbleSortI
	// static void bubbleSortI(int [] arr, int n) {
	// 	for(int i = 0;i<n-1;i++){
	// 		for(int j = 0;j < n-1-i;j++){
	// 			if(arr[j] > arr[j+1]){
	// 				int temp = arr[j];
	// 				arr[j] = arr[j+1];
	// 				arr[j+1] = temp;
	// 			}
	// 		}
	// 	}
	// }

	// bubbleSortR
	static void bubbleSortR(int [] arr, int n, int idx){
		if(idx == n-1) return;
		for(int j = 0;j<n-1-idx;j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
			    arr[j] = arr[j+1];
			  arr[j+1] = temp;
			}
		}
		bubbleSortR(arr, n, idx+1);
	}

	public static void main(String[] args) {
		int [] arr = {34,0,-1,99,0};
		bubbleSortR(arr,arr.length,0);
		for(int i : arr)
			System.out.print(i + " ");

	}

}
