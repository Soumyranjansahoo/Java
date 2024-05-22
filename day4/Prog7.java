//Write a program to input any character and check whether it is alphabet, digit or special character
import java.util.Scanner;
public class Prog7{
 void meth1(char c){
	if(c>='0' && c<='9'){
		System.out.println("The given Character is a digit");
	}
	else 
		System.out.println("The Given Character is a Special character");

 }
 public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any Character");
	char c=sc.next().charAt(0);
	if(c>='a' && c<='z' || c>='A' && c<='Z'){
		System.out.println("The given Character is Alphabet");
	}
	else
	new Prog7().meth1(c);
 }

}
