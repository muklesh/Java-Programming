package allStringProgram;

public class CountAllVowels {

	public static void main(String[] args) {
		String s="IndIa is a great";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'&&c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
