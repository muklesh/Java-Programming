package muku.com;

import java.util.Scanner;

public class PatternA {
	int n;
	public static void main(String[] args) {

	Scanner	s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = s.nextInt();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j==0||i==0||j==n-1||i==n/2)
			{
			System.out.print("*");	
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	s.close();
	}

}
