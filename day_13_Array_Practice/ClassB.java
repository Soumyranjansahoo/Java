//Write a Java program to find the second smallest element in an array.
import java.util.Scanner;
public class ClassB{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the element of an array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		int smallest2=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]<smallest){
				smallest2=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<smallest2 || smallest==smallest2){
				smallest2=arr[i];
			}
		}
		System.out.println("the 2nd Smallest element is"+smallest2);
		sc.close();
	}
}
