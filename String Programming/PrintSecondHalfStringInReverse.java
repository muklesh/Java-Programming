package allStringProgram;

import java.util.Scanner;

public class PrintSecondHalfStringInReverse {

	public static void main(String[] args) {
		System.out.println("wap to print Second half of the String in Reverse.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String temp="";
		String rev="";
		for(int i=s.length()/2;i<s.length();i++)
		{
			temp=temp+s.charAt(i);
		}
		for(int i=s.length()-1;i>=s.length()/2;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		sc.close();


	}

}
