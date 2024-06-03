//Write a program to print reverse tables
import java.util.Scanner;
public class Prog1{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num for reverse table");
		int n=sc.nextInt();
		int i=10;
	
		while(i>=1){
			System.out.println(n+" * "+i+" = "+n*i);
			i--;
		}
	sc.close();
	}
}
		

