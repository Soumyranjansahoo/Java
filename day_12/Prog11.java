//Write a Java program to find the common elements between two arrays.
import java.util.Scanner;
public class Prog11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter an elements of array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter an elements of 2nd array");
                int arr2[]=new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
		int arr3[]=new int[size];
		for(int i=0;i<size;i++){
		   for(int j=0;j<size;j++){
			   if(arr[i]==arr2[j]){
				   int k=0;
				   arr3[k]=arr[i];
				   k++;
			   }
		   }
		}
		for(int i:arr3){
			System.out.println(i);
		}

		sc.close();
	}
}

