package allStringProgram;

public class DeleteFirstSpacesORLastSpaces {

	public static void main(String[] args) {
		String s="  This is my class   ";
		int si=0,li=0;
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				
			}
			else
			{
				si=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				
			}
			else {
				li=i;
				break;
			}
		}
		for(int i=si;i<=li;i++)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
	}

}
