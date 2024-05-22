//Write a program to check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;
public class Prog4{  
     
	public static void main(String args[]){  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a num to check that num is divisible by 5 and 11....");
	  int num=sc.nextInt();
	  if(num%5==0 & num%11==0){
		  System.out.println("This num is Divsible by 5 and 11 both");
	  }
	  else
		  System.out.println("This num is not divisible by 5 and 11");
	}
} 
