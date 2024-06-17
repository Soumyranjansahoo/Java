//Write a Java program to find the length of a string.
import java.util.Scanner;
public class Prog1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string value for finding the length of that string");
	String s=sc.nextLine();
	int len=s.length();
	System.out.println("the length= "+len);
	sc.close();
	}

}
