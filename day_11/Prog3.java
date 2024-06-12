//reverse an array
import java.util.Scanner;
public class Prog3{
	public static void main(String []args){
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 integer value for an array");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=4;j>=0;j--){
			System.out.println(arr[j]);
		}
		sc.close();
	}
}
