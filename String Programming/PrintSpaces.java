package allStringProgram;

public class PrintSpaces {

	public static void main(String[] args) {
		String s="This  is my class";
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				t=t+c;
			}
		}
		System.out.println(t);
		System.out.println("Spaces");
	}

}
