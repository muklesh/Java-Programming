package allStringProgram;

import java.util.Scanner;

public class CharactersInEvenOrder {

	public static void main(String[] args) {
		System.out.println("wap to print character in even index.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String  temp="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
				temp+=s.charAt(i);
		}
		System.out.println(temp);
		sc.close();
	}

}
