// Write a program to Check whether the number is even or odd using switch statement
import java.util.Scanner;
public class Prog5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Any num to check the num is even or odd");
		int num=sc.nextInt();
		num=(int)num;
		int result=num%2;
		switch(result){
			case 0:
				System.out.println("This is Even");
				break;
			case 1:
				System.out.println("This is Odd");
				break;
			default:
				System.out.println("Wrong input");
		}
	}
}
