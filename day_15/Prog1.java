//Write a Java program to find the sum of all elements in an array.
import java.util.Scanner;
public class Prog1{
	public static int  meth1(){
		System.out.println("enter the size of an array");

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];	
		int sum=0;
		System.out.println("enter element of an array");
		for(int i=0;i<size;i++){
		   arr[i]=sc.nextInt();
		   sum+=arr[i];
		}
		return sum;
	}      	
	public static void main(String arg[]){
        System.out.println("sum of given array element : "+Prog1.meth1());
	}
}

