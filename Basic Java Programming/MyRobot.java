package muku.com;

import java.util.Scanner;

public class MyRobot {
	int n;
	public static void main(String[] args) {

	Scanner	s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = s.nextInt();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)
		{
			if(j>=n/2-i&&j<=n/2+i&&i<=n/2||j>=n/4&&j<=3*n/4&&i>=n/2&&j>=i-n/2&&j<=n+n/2-1-i)
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
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)
		{
			if(j>=n/2+i||j<=n+n/2-1-i&&j>n-1-i)
			{
			System.out.print("*");	
			}
			else
			{
				System.out.print(" ");
			}
	}
		for(int j=0;j<n;j++)
		{
			if(j<=i||j>=n-1-i)
			{
			System.out.print("*");	
			}
			else
			{
				System.out.print(" ");
			}
		}
		for(int j=0;j<n;j++)
		{
			if(j<=n/2-i||j<=i&&j>=i-n/2)
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
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)
		{
			if(j<=n-1-i||j>=i)
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
	System.out.println("This is my Robot");
	s.close();
	}
}
