//write a program to reverse the given Digits
import java.util.Scanner;
public class Prog7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  num :");
		int num=sc.nextInt();
		int rem=0;
		int rev=0;
		while(num>0){
			rem=num%10;//19=9
			rev=rev*10+rem;	
			num/=10;
		}
		System.out.println("reverse num= "+rev);
		sc.close();
	}
}
