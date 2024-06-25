//Java program to convert a string to lowercase.
import java.util.Scanner;
public class Prog5{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 2 string value for finding the comparision");
	String s1=sc.next();
	s1=s1.toLowerCase();
	String s2=sc.next();
	s2=s2.toLowerCase();
	System.out.println("the comparision between 2 string is = "+s1);
	System.out.println("the comparision between 2 string is = "+s2);
	sc.close();
	}

}
