package allArrayProgram.com;

import java.util.Arrays;

public class ArraySortUsingInbuilt {

	public static void main(String[] args) {
		int arr[]= {5,8,6,4,7,3,45,65,78,2,23};
		//Arrays.sort(arr);
		Arrays.sort(arr,4,9);
		for(int data:arr)
		{
			System.out.println(data);
		}

	}

}
