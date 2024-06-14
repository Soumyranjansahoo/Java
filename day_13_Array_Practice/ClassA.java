//Write a Java program to find the second smallest element in an array.
import java.util.Scanner;
public class ClassA{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements of given array");

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		int secondndSmallest=arr[0];
		for(int i = 0; i < size; i++) {
		    if(arr[i] < smallest) {
        		secondndSmallest = smallest;
      			smallest = arr[i];
			} 
		    else if(arr[i] < secondndSmallest || secondndSmallest== smallest) {
        		secondndSmallest = arr[i];
   			}
			}

		System.out.println("the 2nd smallest element is"+secondndSmallest);
		sc.close();
	}
}
