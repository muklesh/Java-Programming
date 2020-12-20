package muku.com;

import java.math.BigInteger;

public class ToCheck1To10PrimeNumber {

	public static void main(String[] args) {
		
		// TO Check 1 to 10 prime number using inbuilt method
		for(int i=2;i<50;i++)
		{
			BigInteger b = new BigInteger(""+i);
			if(b.isProbablePrime(100))
			{
				System.out.println(i);
			}
		}
	}

}
