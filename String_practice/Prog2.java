// Write a Java program to concatenate two strings.
import java.util.Scanner;
public class Prog2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string value for finding the length of that string");
	String s1=sc.next();
	String s2=sc.next();
	String s3=s1.concat(s2);
	System.out.println("the new string is= "+s3);
	sc.close();
	}

}
