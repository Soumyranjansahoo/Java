//Write a program to input basic salary of an employee and calculate its Gross salary according to following:
//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
import java.util.Scanner;
public class Prog5{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your basic Salary");
		int Basic_salary=sc.nextInt();
		int Hra;
		int Da;
		int gross;
		if(Basic_salary<=10000){
		 Hra=(Basic_salary*20)/100;
		 Da=(Basic_salary*80)/100;
	 	 gross=Basic_salary+Hra+Da;
		 System.out.println("The Gross Salary is = "+gross);
		}
		else if(Basic_salary<=20000){
                 Hra=(Basic_salary*25)/100;
                 Da=(Basic_salary*90)/100;
                 gross=Basic_salary+Hra+Da;
                 System.out.println("The Gross Salary is = "+gross);
                }

		else if(Basic_salary>20000){
                 Hra=(Basic_salary*30)/100;
                 Da=(Basic_salary*95)/100;
                 gross=Basic_salary+Hra+Da;
                 System.out.println("The Gross Salary is = "+gross);
                }

		else 
			System.out.println("Invalid Input!!");
	}
}
