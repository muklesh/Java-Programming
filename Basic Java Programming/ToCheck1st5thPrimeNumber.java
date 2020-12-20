package muku.com;

import java.math.BigInteger;

public class ToCheck1st5thPrimeNumber {

	public static void main(String[] args) {
		// TO check 1st 5th prime number
		int count=0;
		for(int i=0;count<5;i++)
		{
		BigInteger b = new BigInteger(""+i);
		if(b.isProbablePrime(1))
		{
			System.out.println(i);
			count++;
		}
		}
	}

}
