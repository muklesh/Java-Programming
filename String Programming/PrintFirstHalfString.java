package allStringProgram;

import java.util.Scanner;

public class PrintFirstHalfString {

	public static void main(String[] args) {
		System.out.println("wap to print first half of the String.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		for(int i=0;i<s.length()/2;i++)
		{
			System.out.println(s.charAt(i));
		}
		sc.close();
	}

}
