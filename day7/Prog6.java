// Write a program to Find the number of days in a month using a switch statement
import java.util.Scanner;
public class Prog6{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month for know how many days in that month");
		String month=sc.next();
		switch(month){
			case "january":
				System.out.println("31");
				break;
			case "february":
                                System.out.println("28");
                                break;
			case "march":
                                System.out.println("31");
                                break;
			case "april":
                                System.out.println("30");
                                break;
			case "may":
                                System.out.println("31");
                                break;
			case "june":
                                System.out.println("30");
                                break;
			case "july":
                                System.out.println("31");
                                break;
			case "august":
                                System.out.println("31");
                                break;
			case "september":
                                System.out.println("30");
                                break;
			case "october":
                                System.out.println("31");
                                break;
			case "november":
                                System.out.println("30");
                                break;
			case "december":
                                System.out.println("31");
                                break;
			default:
				System.out.println("Please enter full month name in small leter");
		}
	}
}


