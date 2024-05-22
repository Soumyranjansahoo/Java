//Java Program to Check Whether a Given Number is Even or Odd
import java.util.Scanner;
public class Test1{
	void meth1(int num){
	if(num%2==0)
	{
		System.out.println("The given num is even");
	}
	else {
	
		System.out.println("The given num is odd");
	}}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
	
		if(num==1)
		{
			System.out.println("this is a Special num");
		}
		

		else{
			new Test1().meth1(num);
		}
	}

}
