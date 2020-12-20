package allStringProgram;

public class PrintMiddleCharacterInString {

	public static void main(String[] args) {
		String s="mukleshkumar";
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a')
			{
				t=t+c;
			}
		}
		System.out.println(t);
	}

}
