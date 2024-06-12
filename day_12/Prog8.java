//Write a Java program to sort an array in ascending order.
import java.util.Scanner;
public class Prog8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter the Array element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int k=0;k<size-1;k++){
		   for(int j=0;j<size-1;j++){
			if(arr[j]>arr[j+1]){
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		 	}
		     }
		}

		for(int i:arr){
			System.out.print(" "+i);
		}
		sc.close();
	}
}
