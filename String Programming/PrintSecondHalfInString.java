package allStringProgram;

import java.util.Scanner;

public class PrintSecondHalfInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		for(int i=s.length()/2;i<s.length();i++)
		{
			char c=s.charAt(i);
			
		System.out.print(c);
		}
		sc.close();

	}

}
