
// (23/08/23) : 19:51
import java.util.*;
import java.lang.*;

public class Q00Array2 {

	// QUES: RETURN POSITIONS RETURNING VARIBLE INSIDE ARGUMENT.
	// static ArrayList positions(int [] arr, int target, int ptr, ArrayList<Integer> rtn) {
	// if(ptr == arr.length) return rtn;
	// if(arr[ptr] == target ) {
	// rtn.add(ptr);
	// }
	// return positions(arr,target,ptr+1,rtn);

	// }

	// QUES: RETURN POSITIONS RETURNING VARIBLE INSIDE BODY.
	static List positions(int[] arr, int target, int ptr) {
		List <Integer> rtn = new ArrayList<>();
		if(ptr == arr.length) return rtn;
		if(arr[ptr] == target) rtn.add(ptr);
		List <Integer> temp = positions(arr,target,ptr+1);
		temp.addAll(rtn);
		return temp;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 1, 6, 7, 1, 1, 1 };
		List <Integer> rtn = new ArrayList<>();
		List ans = positions(arr, 1, 0);
		System.out.println(ans);
	}
}
