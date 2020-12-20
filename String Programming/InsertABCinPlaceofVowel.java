package allStringProgram;

public class InsertABCinPlaceofVowel {

	public static void main(String[] args) {
		String s="India is a great";
		String t="";
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length();i++)
		{
			char c=sb.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'&&c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				t=t+"ABC";
			}
			else
			{
				t=t+c;
			}
		}
		System.out.println(t);
	}

}
