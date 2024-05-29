//Write a Java program that demonstrates typecasting from one primitive data type to another. For example, convert an integer to a double and print the result.
import java.util.Scanner;
public class Prog6{
	static{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an integer for typecasting in double");
	int a=sc.nextInt();
	double b=a;
	System.out.println("the value of integer a= "+a);
	System.out.println("the value of double b=a here the implecit typecasting happen value of b= "+b);
	}
	public static void main(String []args){
		System.out.println("************implecit Type casting*************");
	}
}
