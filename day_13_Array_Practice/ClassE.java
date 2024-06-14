//Write a Java program to remove duplicate elements from an array.
import java.util.Scanner;
import java.util.Arrays;
public class ClassE{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
                System.out.println("enter the elements of an array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int j=0;
		int arr2[]=new int[size];
		for(int i=0;i<size-1;i++){
			if(arr[i]!=arr[i+1]){
			arr2[j++]=arr[i];
			}
		}
		arr2[j++]=arr[size-1];
		int result[]=new int[j];
		for(int i=0;i<j;i++){
		     result[i]=arr2[i];
		}
		for(int i:result){
		     System.out.print(i+" ");
		}
		sc.close();
	}
}

