//Write a program to input any character and check whether it is alphabet, digit or special character
import java.util.Scanner;
public class Prog1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any character for checking that isalphabet, digit or special character");
	char c=sc.next().charAt(0);
	if(c>='a' & c<='z' || c>='A' & c<='Z'){
		System.out.println("this is a Alphabet");}
	else if(c>='0' & c<='9'){
		System.out.println("this is a number");
	}
	else 
		System.out.println("this is a special character");
	}
}
