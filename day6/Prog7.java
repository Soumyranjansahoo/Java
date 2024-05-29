//while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100. If quantity and price per item are input through the keyboard, write a program to calculate the total expenses.

import java.util.Scanner;
public class Prog7{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quantity of item");
		int quantity=sc.nextInt();
                System.out.println("Enter the Price of item");
		float price=sc.nextFloat();
		double amount;
		if(quantity>=100){
			amount=(quantity*price)-(quantity*(price*10/100));
			System.out.println("The total expense is = "+amount);
		}
		else if(quantity<100){
			amount=quantity*price;
			System.out.println("The total expense is = "+amount);
		}
		else
			System.out.println("You are entering a wrong Input!!");
	}
}
		
