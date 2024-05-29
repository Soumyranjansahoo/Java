//Explain the difference between widening and narrowing typecasting in Java with examples.
import java.util.Scanner;
public class Prog7{
	static void meth1(){
		System.out.println("**********Welcome to java Typecasting program*************");
		Scanner sc=new Scanner(System.in);
		System.out.println("==========================================================");
		System.out.println('\n'+"enter a short value for implicit typecasting");
		short a=sc.nextShort();
		int b=a;
		System.out.println("the short valu a= "+a+"the int value of b=a and the b= "+b);
                System.out.println("==========================================================");
		short c=(short)b;
		System.out.println("here we are doing explicit typecasting short c=b and b="+b+" after typecasting the c val= "+c);
	}
	public static void main(String []args){
		meth1();
	}

}	

				
