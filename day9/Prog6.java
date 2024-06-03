// Write a program to find sum of all natural numbers between 1 to n
import java.util.Scanner;
public class Prog6{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any natural num for find sum");
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<=n){
			sum+=i;
			i++;

		}
		System.out.println(sum);
//c.close();
	}
}
		

