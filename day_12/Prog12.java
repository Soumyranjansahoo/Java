//Write a Java program to find the common elements between two arrays.
import java.util.Scanner;
public class Prog12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter an elements of array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
                System.out.println("enter an elements for second array");
                int arr2[]=new int[size];
                for(int i=0;i<size;i++){
                        arr2[i]=sc.nextInt();
                }
		System.out.println("The common element of the given array is: ");
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(arr[i]==arr2[j]){
					System.out.println(arr[i]);
					break;
				}
			}
		}

		sc.close();
	}
}

