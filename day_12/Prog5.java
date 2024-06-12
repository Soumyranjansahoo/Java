//Write a Java program to find the second largest element in an array.
import java.util.Scanner;
public class Prog5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int num=arr[0];
		int num2=0;
		for(int j=0;j<size;j++){
			if(arr[j]>num){
				num2=num;
				num=arr[j];
			}
		}
		System.out.println("The 2nd largest element is "+num2);
		sc.close();
		}
}
