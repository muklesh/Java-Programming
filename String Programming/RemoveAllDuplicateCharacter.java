package allStringProgram;

public class RemoveAllDuplicateCharacter {

	public static void main(String[] args) {
		String  s="banana";
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(t.contains(""+c))
			{
				
			}
			else
			{
				t=t+c;
			}
		}
		System.out.println(t);

	}

}
