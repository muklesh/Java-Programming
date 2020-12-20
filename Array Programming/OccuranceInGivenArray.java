package allArrayProgram.com;

public class OccuranceInGivenArray {

	public static void main(String[] args) {
		int ar[]={5,6,2,4};
		int min=Integer.MAX_VALUE;
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			String s=Integer.toBinaryString(ar[i]);
		for(int j=0;j<=s.length()-2;j++)
		{
			if(s.charAt(i)>0)
			{
				min=c;
			}
		}
		}
		System.out.println(min);
	}

}
