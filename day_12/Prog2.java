//Write a Java program to find the maximum element in an array.
import java.util.Scanner;
public class Prog2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the element of an array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int j=0;j<size;j++){
			if(arr[j]>max){
				max=arr[j];
			}
		}
		for(int i:arr)
			System.out.println("given array elements are :"+i);
		System.out.println("The maximum element of given array is "+max);
		sc.close();
	}
}
		

			
