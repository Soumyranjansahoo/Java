import java.util.Scanner;
public class Prog7{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lengh of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int j:arr){
			System.out.println(j);
		}
		sc.close();
	}
}

