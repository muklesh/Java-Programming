package allStringProgram;

import java.util.Scanner;

public class EvenIndexInReverse {

	public static void main(String[] args) {
		System.out.println("wap to print character of even index in reverse.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String  s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(i%2==0)
				rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		sc.close();
	}

}
