//Write a Java program to find the missing number in an array of integers.
import java.util.Scanner;
public class ClassH{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("enter the element of an array to fining the  missing element");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int Missing_num=meth1(arr);
		System.out.println("the missing element is "+Missing_num);
				
	}
	static int meth1(int arr[]){
		int n=arr.length+1;
		int sum=0;
		sum+=n*(n+1)/2;
		int totalsum=0;
		for(int i:arr){
			totalsum+=i;
		}
		return sum-totalsum;
	}
}
