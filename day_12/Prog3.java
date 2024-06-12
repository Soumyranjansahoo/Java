//Write a Java program to find the minimum element in an array.
import java.util.Scanner;
public class Prog3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the element of an array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int j=0;j<size;j++){
			if(arr[j]<min){
				min=arr[j];
			}
		}
		for(int i:arr)
			System.out.println("given array elements are :"+i);
		System.out.println("The minimum element of given array is "+min);
		sc.close();
	}
}
		

			
