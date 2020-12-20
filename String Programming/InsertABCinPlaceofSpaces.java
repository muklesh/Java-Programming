package allStringProgram;

public class InsertABCinPlaceofSpaces {

	public static void main(String[] args) {
		String s="This is my class";
		StringBuffer sb=new StringBuffer(s);
		String t="";
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ')
			t=t+"ABC";
			else
				t=t+sb.charAt(i);	
		}
		System.out.println(t);
		
}
}
