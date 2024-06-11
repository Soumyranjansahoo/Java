//Write a Java program to find the average of elements in an array.
import java.util.Scanner;
public class Prog4{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the element of an array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int j=0;j<size;j++){
			sum+=arr[j];
		}
		
		double avg=(double)sum/size;
		System.out.println("sum ="+sum);
		System.out.println("The average of given array is "+avg);
		sc.close();
	}
}
		

			
