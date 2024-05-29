// Write a program to input angles of a triangle and check whether triangle is valid or not
import java.util.Scanner;
public class Prog2{
	void meth1(int a, int b, int c){
		if(a+b+c==180){
			System.out.println("given triangle Angles are valid");
			
			}
		else
                        System.out.println("given triangle Angles are Invalid!!");
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 triangle angle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Prog2 obj=new Prog2();
		obj.meth1(a,b,c);
	}
}
