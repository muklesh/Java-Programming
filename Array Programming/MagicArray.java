package allArrayProgram.com;

import java.util.Arrays;

public class MagicArray {

	public static void main(String[] args) {
		int ar[]= {2,3,8,4,14,13,18,12,15};
		int br[]=ar.clone();
		Arrays.sort(br);
		int gn=0;
		int bn=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==br[i])
			{
				gn=gn+ar[i];
			}
			else {
				bn=bn+ar[i];
			}
		}
		System.out.println(gn-bn);

	}

}
