package allStringProgram;

public class RemoveAllSpecialCharacter {

	public static void main(String[] args) {
		/*1st way,
		String s="muklesh123@#$%&";
		s=s.replaceAll("[^0-9a-zA-Z]","");
		System.out.println(s);*/
		//2nd way,
		String s="muklesh123@#$%%^&*";
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9')
			{
				t=t+c;
			}
		}
		System.out.println(t);
	}

}
