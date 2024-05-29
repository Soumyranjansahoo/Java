// Write a program to input week number and print week day
import java.util.Scanner;
public class Prog2{
	void meth1(int num){
	if(num==1)
		System.out.println("sunday");
	else if(num==2)
		System.out.println("monday");
	else if(num==3)
                System.out.println("tuesday");
	else if(num==4)
                System.out.println("Wednesday");
	else if(num==5)
                System.out.println("Thursday");
	else if(num==6)
                System.out.println("Friday");
	else if(num==7)
                System.out.println("Saturday");
	}
	public static void main(String []args){
		System.out.println("enter a num between 1 to 7");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (num>=1 & num<=7){
			new Prog2().meth1(num);
		}
		else
			System.out.println("you are enter a invalid option!!");
	}
}


