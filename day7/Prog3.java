//Write a program to read gender(M/F) and print the corresponding gender using a switch statement
import java.util.Scanner;
public class Prog3{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter M/F for checking male or female");
		char c=sc.next().charAt(0);
		if(c=='m' | c=='M' | c=='f' | c=='F'){
			switch(c){
				case 'm':
					System.out.println("Male");
					break;
				case 'M':
                                        System.out.println("Male");
					break;
				case 'f':
                                        System.out.println("Female");
					break;
				case 'F':
                                        System.out.println("Female");
					break;
			}
		}
		else
			System.out.println("You are entering a Wrong Input");
	}
}

