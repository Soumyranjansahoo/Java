//reverse array using recursion
import java.util.Scanner;
public class Prog4{

	public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        
       
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        reverseArray(arr, start + 1, end - 1);
   	 }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.println("enter Element of an array");
	int arr[]=new int[5];
	for(int i=0;i<5;i++){
	arr[i]=sc.nextInt();
	}        
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        reverseArray(arr, 0, arr.length - 1);
        
        System.out.println("\nReversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
	}
    }
}
