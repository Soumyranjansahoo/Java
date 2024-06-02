//Write a program to print all natural numbers in reverse
import java.util.Scanner;
public class Prog4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			System.out.println(n);
			n--;
		}
		sc.close();
	}
}
