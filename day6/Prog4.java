// Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
import java.util.Scanner;
public class Prog4{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 sides of a triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b>c && b+c>a && a+c>b)
		new Prog4().meth1(a,b,c);
		else
			System.out.println("Triangle is invalid!!");
		}
	void meth1(int a,int b,int c){
	
	
		if(a==b && b==c)
			System.out.println("triangle is Equilateral");
		else if(a==b || b==c || c==a)
                        System.out.println("triangle is Isosceles");
		else
                        System.out.println("triangle is Scalene");
		}
}
