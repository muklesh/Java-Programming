package allStringProgram;

public class InputA2B3C4OutputAABBBCCC {

	public static void main(String[] args) {
		String s="A2B3C4";
		String t="";
		String alpha=s.replaceAll("[^A-Z]","");
		String num=s.replaceAll("[^0-9]","");
		for(int i=0;i<alpha.length();i++)
		{
			char c=alpha.charAt(i);
			//System.out.print(c);
			for(int j=0;j<num.length()-48;j++)
			{
			   t=t+c;
			}
		}
		   System.out.println(t);

	}

}
