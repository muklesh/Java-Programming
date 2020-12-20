package allArrayProgram.com;

public class PrintArray {

	public static void main(String[] args) {
		int  arr[]= {5,3,1,2,4};
		/*for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}*/
		//now 2nd print array using each for loop
		for(int data:arr)
		{
			System.out.println(data);
		}

	}

}
