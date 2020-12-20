package allStringProgram;

import java.util.Scanner;

public class PrintSecondHalfString {

	public static void main(String[] args) {
		System.out.println("wap to print first half of the String.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		for(int i=s.length()/2;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		sc.close();
	}

}
