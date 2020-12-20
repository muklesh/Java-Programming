package allStringProgram;

import java.util.Arrays;

public class ToCheckAnagram {

	public static void main(String[] args) {
		String s="Fourth of July";
		String s1="Joyful Fourth";
		
		s=s.replace(" ","");
		s1=s1.replace(" ","");
		
		s=s.toUpperCase();
		s1=s1.toUpperCase();
		
		char ar[]=s.toCharArray();
		char ar1[]=s1.toCharArray();
		
		Arrays.sort(ar);
		Arrays.sort(ar1);
		
	    boolean res = Arrays.equals(ar,ar1);
	    
	    if(res==true)
	    {
	    	System.out.println("it is Anagram");
	    }
	    else
	    {
	    	System.out.println("it is not Anagram");
	    }

	}

}
