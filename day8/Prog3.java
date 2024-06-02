//Write a program to print all natural numbers from 1 to n
import java.util.Scanner;
public class Prog3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range of the natural num display");
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}
