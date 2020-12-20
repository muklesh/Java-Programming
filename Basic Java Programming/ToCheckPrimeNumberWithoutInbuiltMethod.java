package muku.com;

public class ToCheckPrimeNumberWithoutInbuiltMethod {
	static int sum=0;
	public static void main(String[] args) {
		// TO check prime number without inbuilt method
		int a=10;
		int b=50;
		for(int i=a;i<=b;i++)
		{
			isProbablePrime(i);
		}
		System.out.println(sum);
	}

	private static void isProbablePrime(int x) {
		int flag=0;
		for(int j=2;j<x;j++)
		{
			if(x%j==0)
			{
				flag++;
			}
		}
	if(flag==0)
	{
		System.out.println(x);
      sum=sum+x;	
	}
}
}
