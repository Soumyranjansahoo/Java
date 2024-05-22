//Write a program to find maximum between three numbers
import java.util.Scanner;
public class Prog2{  
     
	public static void main(String args[]){  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter 3 num ");
	  int num1=sc.nextInt();
	  int num2=sc.nextInt();
	  int num3=sc.nextInt();
	  if(num1>num2 & num2>num3){
		  System.out.println("The Maximum num is num1 "+num1);
	  }
	  else if(num2>num1 & num2>num3)
		  System.out.println("The Maximum num is Num2 " +num2);
	  else
		  System.out.println("The Maximum num is Num3" +num3);
	}
} 
