package muku.com;

public class Leapyear {

	public static void main(String[] args) {
		int n=2000;
		if(n%4==0||(n%4==0&&n%100!=0))
		{
			System.out.println("leap year");
		}
		else
			System.out.println("not leap year");
			
		}

	}


