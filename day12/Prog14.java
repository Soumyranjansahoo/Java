//Write a Java program to remove duplicate elements from an array.
import java.util.Scanner;
public class Prog14{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of an array");
                int size=sc.nextInt();
                System.out.println("enter an elements of array");
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
		int uniqueArray=removeDuplicates(arr);
	}
	public static int[] removeDuplicates(int arr[]){
		int count=0;
		for(int i=0;i<arr.lenght;i++){
			boolean duplicate=false;
			for(int j=0;j<i.length;j++){
			if(arr[i]==arr[j]{
				duplicate=true;
				break
			}
			}
			if(!duplicate){
				count++;
			}
		}
		int uniqueArray=new int[count];
		int index=0;

				

