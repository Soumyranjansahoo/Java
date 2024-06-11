//Write a Java program to find the sum of all elements in an array.
import java.util.Scanner;
public class Prog1{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the element of an array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<size;j++){
			sum+=arr[j];
		}
		System.out.println(sum);
		sc.close();
	}
}
