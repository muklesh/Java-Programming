package allStringProgram;

import java.util.Scanner;

public class RemoveAllUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A'&&c<='Z')
			{
			}
			else
			{
				t=t+c;
			}
		}
		System.out.println(t);
		sc.close();
	}

}
