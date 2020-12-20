package allArrayProgram.com;

public class CopyArrays {

	public static void main(String[] args) {
		int arr[]={5,7,3,2,6};
		int br[]=arr.clone();
		for(int data:br)
		{
			System.out.println(data);
		}
		

	}

}
