//Write a program to find the factorial value of any number using forloop
import java.util.Scanner;
public class Prog5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num for viw Factorial of that num:");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact*=i;
		}
		System.out.println("The factorial of given num is = "+fact);
		sc.close();
	}
}

