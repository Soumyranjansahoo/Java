//Write a Java program to sort an array in descending order.
import java.util.Scanner;
public class Prog9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter an elements of array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-1;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr){
			System.out.print(" "+i);
	
		}
	sc.close();
	}
}

