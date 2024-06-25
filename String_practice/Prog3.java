//Write a Java program to compare two strings.
import java.util.Scanner;
public class Prog3{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 2 string value for finding the comparision");
	String s1=sc.next();
	String s2=sc.next();
	
	System.out.println("the comparision between 2 string is = "+s1.compareTo(s2));
	sc.close();
	}

}
