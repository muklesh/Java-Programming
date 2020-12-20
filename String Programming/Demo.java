package allStringProgram;

public class Demo {

	public static void main(String[] args) {
	String s="This is my class.";
	String ar[]=s.split(" ");
	String t="";
	String t1="";
	for(int i=0;i<ar.length;i++)
	{
	 t=(ar[i]+"");
	 for(int j=t.length()-1;j>=0;j--)
	 {
		 t1=t1+t.charAt(j);
	 }
	 System.out.print(t1+" ");
	  t1="";
	}
	System.out.println();

	}

}
