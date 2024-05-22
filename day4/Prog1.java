// Write a program to find maximum between two numbers
import java.util.Scanner;
public class Prog1{  
     
	public static void main(String args[]){  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter 2 num ");
	  int num1=sc.nextInt();
	  int num2=sc.nextInt();
	  if(num1>num2){
		  System.out.println("The Maximum num is num1 "+num1);
	  }
	  else
		  System.out.println("The Maximum num is Num2 " +num2);
	}
} 
