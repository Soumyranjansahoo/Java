//write a program to sum of its Digits
import java.util.Scanner;
public class Prog8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  num :");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		while(num>0){
			rem=num%10;
			sum+=rem;	
			num/=10;
		}
		System.out.println("sum num= "+sum);
		sc.close();
	}
}
