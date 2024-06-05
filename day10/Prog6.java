//Write a program to find the value of one number raised to the power of another
import java.util.Scanner;
public class Prog6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any base num :");
		int num=sc.nextInt();
		System.out.println("Enter the power num");
		int power=sc.nextInt();
		int result=1;
		for(int i=1;i<=power;i++){
			result*=num;
		}
		System.out.println("The result "+result);
		sc.close();
	}
}

