package allArrayProgram.com;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {3,2,4,5,6,8,15,11,3,6};
		Arrays.sort(arr);
		int index =Arrays.binarySearch(arr,5);
		System.out.println(index);

	}

}
