package allStringProgram;

public class CountDuplicateCharacterInGivenString {

	public static void main(String[] args) {
		String s="mississippi";
		String t="issi";
		String t1="";
		int count=0;
		for(int i=0;i<s.length()-3;i++)
		{
			t1="";
			for(int j=i;j<=i+3;j++)
			{
				t1=t1+s.charAt(j);
			}
			if(t.equals(t1))
			{
				count++;
			}
		}
		System.out.println(count);
		}
	}

