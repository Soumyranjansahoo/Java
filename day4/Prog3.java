//Write a program to check whether a number is negative, positive or zero
import java.util.Scanner;
public class Prog3{  
     
	public static void main(String args[]){  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a num to check that num is positive or negative ");
	  int num=sc.nextInt();
	  if(num>0){
		  System.out.println("This num is Positive");
	  }
	  else if(num<0)
		  System.out.println("This num is Negative");
	  else
		  System.out.println("This num is equal to zero");
	}
} 
