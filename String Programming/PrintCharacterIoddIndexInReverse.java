package allStringProgram;

import java.util.Scanner;

public class PrintCharacterIoddIndexInReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(i%2==1)
			{
				t=t+c;
			}
		}
		System.out.println(t);
		sc.close();
	}

}
