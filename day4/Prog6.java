//Write a program to check whether a character is alphabet or not
import java.util.Scanner;
public class Prog6{  
     
	public static void main(String args[]){  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a Character");
	  char c=sc.next().charAt(0);
	  if(c>='a' && c<='z' || c>='A' && c<='Z'){
		  System.out.println("The given Charcter is Alphabet ");
	  }
	  else{
		  System.out.println("The given Charcter is not Alphabet");
	  }
	}
} 
