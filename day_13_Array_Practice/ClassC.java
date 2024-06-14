//Write a Java program to find the frequency of each element in an array.
import java.util.Scanner;
public class ClassC{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an ellement");
		int size=sc.nextInt();
		System.out.println("Enter the element of an array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int frequency[]=new int[100];
		for(int i:arr){
			frequency[i]++;
		}
		for(int i=0;i<100;i++){
			if(frequency[i]>0){
				System.out.println(i+" "+frequency[i]);
			}
		}
		//for(int result:arr){
		//	System.out.print(result);
		
		sc.close();
	}
}

