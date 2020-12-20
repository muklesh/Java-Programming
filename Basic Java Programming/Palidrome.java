package muku.com;

//import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		int temp,sum=0,r;
		int num=454;
	//Scanner s = new Scanner(System.in);
	//System.out.println("Enter the num");
	//int num = s.nextInt();
	temp=num;
while(num>0)
{
	 r=num%10;
sum=(sum*10)+r;
}
		if(temp==sum)
	
			System.out.println("palindrome num");
	
		else
			System.out.println("not palindrome num");


	}

}
