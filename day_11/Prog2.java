import java.util.Scanner;
public class Prog2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data for Array");
		int arr[];
		arr=new int[10];
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		 for(int i=0;i<5;i++){
                       System.out.println(arr[i]);
                }
	sc.close();
	}
}

