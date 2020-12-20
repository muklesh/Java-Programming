package allStringProgram;

public class ConvertVowelToLowercaseAndConsonantsToUppercase {

	public static void main(String[] args) {
		String s="muklesh";
		String t="";
		String t1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='A'||c=='E'||c=='O'||c=='I'||c=='U'||c=='a'||c=='o'||c=='e'||c=='i'||c=='u')
			{
				t=t+c;
				t=t.toLowerCase();
			}
			else
			{
				t1=t1+c;
				t1=t1.toUpperCase();
			}
		}
		System.out.println(t1+t);

	}

}
