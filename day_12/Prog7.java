//Write a Java program to reverse an array.
import java.util.Scanner;
public class Prog7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter the Array element");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0,k=size-1;j<k;j++, k--){
			int temp=arr[j];
			arr[j]=arr[k];
			arr[k]=temp;
		}
		for(int i:arr){
			System.out.print(" "+i);
		}
		sc.close();
	}
}
