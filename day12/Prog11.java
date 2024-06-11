//Write a Java program to find the frequency of each element in an array.i
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
		int frequency[]=new int[100]; 
		for(int i:arr){
			frequency[i]++;
		}
		System.out.println("frequency of an each element is");
		for(int i=0;i<frequency.length;i++){
			if(frequency[i]>0){
				System.out.println(i+" "+frequency[i]);
			}
			}
		sc.close();
	}
}

