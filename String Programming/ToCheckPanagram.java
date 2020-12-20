package allStringProgram;

public class ToCheckPanagram {

	public static void main(String[] args) {
		String s="The Quick brown fox jumps over a lazy dog";
		 String s1=s.toUpperCase();
		 String ar[]=s1.split(" ");
		System.out.println(ar);
		int c=0;
		for(int i=65;i<=90;i++)
		{
			if(s1.contains(""+i))
			{
				c++;
			}
		}
		System.out.println(c);
		if(c==26)
		{
			System.out.println("It is Panagram");
		}
		else
		{
			System.out.println("It is not panagram");
		}

	}

}
