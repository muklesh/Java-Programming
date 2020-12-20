package allStringProgram;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s="abcicbbcdefggfed";
		static boolean isPal(String s)
		{
			StringBuffer sb=new StringBuffer(s);
			sb.reverse();
			if(s.contains(sb))
			{
				return true;
			}
				else{
					return false;
				}
		}
		public static void main(String[] args) 
		{
			String s="abcicbbcdefggfed";
			rama:for(int ls=s.length()-2;ls>=2;ls--)
			{
				for(int i=0;i<s.length()-ls;i++)
				{
					String t=s.substring(i,i+ls);
					if(isPal(t))
					{
						System.out.println(t);
						break rama;
					}
				}
			}
	}
}
