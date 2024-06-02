//Write a program to print tables
import java.util.Scanner;
public class Prog5{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num for view that table");
		int n=sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.print(n*i+" ");
			i++;
		}
		System.out.println();
		int j=1;
		while(j<=10){
                        System.out.print(j+" ");
                        j++;
                }
		int k=1;
		 while(k<=10){
                        System.out.print("* ");
                        k++;
                }
		System.out.println();
		int l=1;
		 while(l<=10){
                        System.out.print(n+" ");
                        l++;
                }
		sc.close();
	}
}



