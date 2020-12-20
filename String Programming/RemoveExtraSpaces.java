package allStringProgram;

import java.util.Scanner;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
		{
			
		}
		else
		{
			t=t+s.charAt(i);
		}
		}
		System.out.println(t);
		sc.close();
	}

}
