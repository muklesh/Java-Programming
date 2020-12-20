package allStringProgram;

public class CountSpacesInString {

	public static void main(String[] args) {
		String s="india is a great";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
