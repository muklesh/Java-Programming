package allArrayProgram.com;

public class FindMaxProfitInArray {

	public static void main(String[] args) {
		int ar[]={5,3,6,2,4,1,7};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
		for(int j=i+1;j<ar.length;j++)
		{
			int diff=ar[j]-ar[i];
			if(diff>max)
			{
				max=diff;
			}
		}
		}
		System.out.println(max);

	}

}
