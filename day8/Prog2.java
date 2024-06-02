// Write a program to print// *
//*
//**
// ***
// ****
import java.util.Scanner;
public class Prog2{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line for pattern");
		int l=sc.nextInt();
		System.out.println("Enter Character for pattern");
		char c=sc.next().charAt(0);
		int i=0;
		while(i<=l)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print(c);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}

