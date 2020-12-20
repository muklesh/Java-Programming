package allStringProgram;

import java.util.Scanner;

public class OddIndex {

	public static void main(String[] args) {
		System.out.println("wap to print character in odd index.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==1)
				temp=temp+s.charAt(i);
		}
		System.out.println(temp);
		sc.close();
	}

}
