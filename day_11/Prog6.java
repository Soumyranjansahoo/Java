import java.util.Scanner;
public class Prog6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" value for array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int j=size-1;j>=0;j--){
			System.out.println(arr[j]);
		}
		sc.close();
	}
}

