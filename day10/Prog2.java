//Write a program to print ascii value
import java.util.Scanner;
public class Prog2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character to view the ascii value of that: ");
		char c=sc.next().charAt(0);
		System.out.println("the ascii value of given char is : "+(int)c);
		/*int i=1;

		while (i<=255){
			System.out.println((char)i);
			i++;*/
		
	}
}



