package muku.com;

import java.math.BigInteger;

//This is Inbuilt method math package of BigInteger
public class BigIntegers {

	public static void main(String[] args) {
		
		BigInteger b = new BigInteger("7");
		BigInteger a= new BigInteger("5");
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		System.out.println(a.mod(b));
		System.out.println(a.pow(3));

	}

}
