//Write a program to find sum of all odd numbers between 1 to n
import java.util.Scanner;
public class Prog3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num for viw sum of odd num");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num){
			if(i%2!=0){
				sum+=i;
			}
			i++;
		}
			System.out.println("Sum= "+sum);
	sc.close();
	}
}
