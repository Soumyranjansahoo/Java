// write a program to Check Whether a Given Number is Prime or Not
import java.util.Scanner;
public class Prog9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  num :");
		int num=sc.nextInt();
		int i=2;
		int count=0;	
		while(i<num){
			if(num%i==0){
			count++;
			}
			i++;
		}
		if(count==0)
		System.out.println("This is Prime num");
		else
		System.out.println("This is not Prime num");

		sc.close();
	}
}
