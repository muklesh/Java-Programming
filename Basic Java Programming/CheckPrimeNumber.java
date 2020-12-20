package muku.com;

import java.math.BigInteger;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		BigInteger b = new BigInteger("12");
		
		System.out.println(b.nextProbablePrime());
		System.out.println(b.isProbablePrime(1));

	}

}
