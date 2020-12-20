package allStringProgram;

public class Piglatin {

	public static void main(String[] args) {
		String s="Trouble";
		String rp="" ;
		String lp="";
		String fs="";
		int i=0;
		s=s.toUpperCase();
	for(i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c!='A'&&c!='O'&&c!='E'&&c!='I'&&c!='U')
		{
			lp=lp+c;
		}
		
		if(c=='A'||c=='O'||c=='E'||c=='I'||c=='U')
		{
			for(int j=i;j<s.length();j++)
			rp=rp+s.charAt(j);
			break;
		}
		
	}
	
	fs=rp+lp+"AY";
	System.out.println(fs);
	}
}
