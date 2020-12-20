package muku.com;

public class FebbonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			//Here swap num and hold
			a=b;
			b=c;
		}
	}

}
