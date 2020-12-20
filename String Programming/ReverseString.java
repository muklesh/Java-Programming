package allStringProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("wap to print Reverse in String");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);
		sc.close();
	}

}
