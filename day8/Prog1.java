//Write a program to print the following pattern :
//****

//***

//**

import java.util.Scanner;
public class Prog1{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the line no");
		int n=sc.nextInt();
		System.out.println("enter any character for above pattern");
		char c=sc.next().charAt(0);
		int i=0;
		while(i<=n){//0
			int j=0;
			while(j<=n-i){//0<10
				System.out.print(c);//10 times
				j++;
			}			
			System.out.println();
			i++;
		
		}
	}
}
