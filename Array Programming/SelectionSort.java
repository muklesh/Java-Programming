package allArrayProgram.com;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[]= {5,1,3,4,6,2,7};
		for(int i=0;i<ar.length-2;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
		for(int data:ar)
		{
			System.out.println(data);
		}

	}

}
