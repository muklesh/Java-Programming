package allStringProgram;

public class Reverse {

	public static void main(String[] args) {
		String s="1+2*3-20";
		 s=s.replaceAll("20","02");
		StringBuffer sb=new StringBuffer(s);
		for(int i=sb.length();i>=0;i--)
		{
			sb.reverse();
		}
		System.out.println(sb);
		
	}

}
