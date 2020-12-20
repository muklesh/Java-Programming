package muku.com;

import java.util.Scanner;

public class AmarName {
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
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)
		{
			if(j==0||i==j&&i<=n/2||j==n-1||j==n-1-i&&i<n/2)
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
			System.out.print(" ");
		}
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
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
		}

			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==n/2||j==n-1&&i<=n/2||j==i-n/2)
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


