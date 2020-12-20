package allStringProgram;

public class ReplaceVowelWith1OrSpaceWith2 {

	public static void main(String[] args) {
		
		String s="apples are red in color";
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='o'||c=='i'||c=='e'||c=='u')
			{
			c='1';
			}
			else if(c==' ')
			{
				c='2';
			}
			System.out.print(c);
					}
		
	}

}
