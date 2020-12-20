package allStringProgram;

public class CountExtraSpacesInString {

	public static void main(String[] args) {
		String s="india  is  a  gr  eat";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
