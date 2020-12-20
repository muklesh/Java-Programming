package allStringProgram;

public class CountAllUpperCaseCharacter {

	public static void main(String[] args) {
		String s="This is My Class";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A'&&c<='Z')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
