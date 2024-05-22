//Write a program to check whether a year is leap year or not
import java.util.Scanner;
public class Prog5{  
     
	public static void main(String args[]){  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a Year for check that is a leap year or not");
	  int year=sc.nextInt();
	  if(year%4==0 || year%100==0){
		  System.out.println("The given Year is a leap year ");
	  }
	  else
		  System.out.println("The give year is not a leap year");
	}
} 
