package allStringProgram;

public class CountNumericalCharacter {

	public static void main(String[] args) {
		String s="muklesh14664";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
