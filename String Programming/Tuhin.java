package allStringProgram;

import java.util.Scanner;

public class Tuhin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s1=scan.next();
		String s2=scan.next();
		int count=0;
		for (int i = 0; i<=s1.length()-s2.length();i++) {
			
			String t=s1.substring(i,i+s2.length());
			
			if(t.equals(s2)) {
				
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
