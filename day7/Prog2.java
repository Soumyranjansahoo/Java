//Write a program to read a weekday number and print weekday name using switch statement

import java.util.Scanner;
public class Prog2{
	public static void main(String [] Args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number 1-7 for show weekday");
		int input=sc.nextInt();
		switch(input){
			case 1:
				System.out.println("sunday");
				break;
			case 2:
                                System.out.println("monday");
				break;
			case 3:
                                System.out.println("tuesday");
				break;
			case 4:
                                System.out.println("wednesday");
				break;
			case 5:
                                System.out.println("thurseday");
				break;
			case 6:
                                System.out.println("Friday");
				break;
			case 7:
                                System.out.println("saturday");
				break;
			default:
				System.out.println("You are entering a Wrong Input");
		}
	}
}
