//Write a Java program to find the index of a specific element in an array.
import java.util.Scanner;
public class Prog15{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to find in an array");
		int element=sc.nextInt();
		
		for(int i=0;i<size;i++){
			if(arr[i]==element){
			
			System.out.println("the Index of given element is "+i);
			break;}

		}

		sc.close();
	}
}

