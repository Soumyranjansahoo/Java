//array prog1
import java.util.Scanner;
public class Prog1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 integer value");
		int arr[]=new int[];
		int abc[]={1,2,3,4,5};
		for(int i=0;i<5;i++){

		arr[i]=sc.nextInt();    		
		}
		System.out.println(arr[0]);
		System.out.println(abc[2]);
		sc.close();
	}
}
