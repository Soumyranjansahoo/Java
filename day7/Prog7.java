//Write a program to Menu driven program using switch statement ( Find addition, subtraction, multiplication and division of to integer numbers )
import java.util.Scanner;
public class Prog7{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("******Choose option******");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int input=sc.nextInt();
		System.out.println("========================================");
		System.out.println("Enter Num1");
		int num1=sc.nextInt();
		System.out.println("Enter Num2");
		int num2=sc.nextInt();
		switch(input){
			case 1:
				System.out.println("The addition of given numbers = "+(num1+num2));
				break;
			case 2:
                                System.out.println("The substraction of given numbers = "+(num1-num2));
				break;
			case 3:
                                System.out.println("The Multiplication of given numbers = "+(num1*num2));
				break;
			case 4:
                                System.out.println("The Division of given numbers = "+(num1/num2));
				break;
			default:
				System.out.println("please choose option between 1 to 4");
		}
	}
}

				

