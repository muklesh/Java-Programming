package muku.com;

import java.util.Scanner;

public class PrintTheNumberSeries {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();*/
		int a[]= {6*6,-5,4*4,-3,2*2,-1,0,1,2/3,27,4/3,125,6/3};
		for(int i=a.length/2;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.println(i*i);
			}
			else
			{
				System.out.println(-(i));
			}

		}
		
		
	}

}
