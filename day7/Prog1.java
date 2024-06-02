//Write a Java program to create a simple calculator

import java.util.Scanner;
public class Prog1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num for calulation");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd num for calculation");
		int num2=sc.nextInt();
		System.out.println("Enter the operation *,+,/,-,%");
		char c=sc.next().charAt(0);
		switch(c){
			case '+':
				System.out.println("result ="+(num1+num2));
				break;
			case '-':
				System.out.println("result ="+(num1-num2));
				break;
			case '*':
				System.out.println("result ="+(num1*num2));
				break;
			case '/':
				System.out.println("result ="+(num1/num2));
				break;
			case '%':
				System.out.println("result ="+(num1%num2));
				break;
			default :
				System.out.println("You input is not valid");
		}
	}
}
