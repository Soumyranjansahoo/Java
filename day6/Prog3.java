//Write a program to input all sides of a triangle and check whether triangle is valid or not
import java.util.Scanner;
public class Prog3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 side of triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();;
		int c=sc.nextInt();
		if(a+b>c && b+c>a && c+a>b)
		{
			System.out.println("Triangle is valid");
		}
		else
			System.out.println("triangle is not valid");
	}
}
