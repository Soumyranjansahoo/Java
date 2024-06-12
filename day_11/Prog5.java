//Reverse an arry
import java.util.Scanner;
public class Prog5{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(num+" is a prime num");
		}
		else
			System.out.println(num+" is not a prime num");
	}
}
