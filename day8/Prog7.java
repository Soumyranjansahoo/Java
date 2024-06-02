//Write a program to print tables
import java.util.Scanner;
public class Prog7{
        public static void main(String []args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter any num for view that table");
                int n=sc.nextInt();
                int i=1;
                while(i<=10){
                        System.out.print(n);
                        System.out.print(" * ");
			System.out.print(i+"= ");
                        System.out.print(n*i+" ");
			System.out.println();
		  	i++;
                }
                sc.close();
        }
}

