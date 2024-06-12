//Write a program to find the factorial value of any number
import java.util.Scanner;
public class Prog4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num for viw Factorial of that num:");
		int num=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=num){
			fact*=i;
			i++;
		}
		System.out.println("fact= "+fact);
	sc.close();
	}
}
