//The current year and the year in which the employee joined the organization are entered through the keyboard. If the number of years for which the employee has served the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If the years of service are not greater than 3, then the program should do nothing
import java.util.Scanner;
public class Prog8{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your joining Year");
		int joining_year=sc.nextInt();
		System.out.println("enter currect year");
		int current_year=sc.nextInt();
		if(current_year-joining_year>=3){

			System.out.println("You will get Rs.2500 bonus");
		}
		else if(current_year-joining_year<=3)
			System.out.println("Work Hard!!");
		else
			System.out.println("Wrong Input!!");
	}
}
