package allStringProgram;

import java.util.Scanner;

public class PrintCharacterMultiple3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(i%3==0)
			{
				t=t+c;
			}
		}
		System.out.println(t);
	
		sc.close();

	}

}
