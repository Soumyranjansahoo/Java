
import java.util.Scanner;
public class Prog7{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter line num ");
		int l=sc.nextInt();
		System.out.println("enter any char");
		char c=sc.next().charAt(0);
		int i=1;
		while(i<=l){
			int j=1;
			while(j<=i){
				System.out.print(c);
				j++;
			}
			System.out.println();
			i++;
		}
	sc.close();
	}
}
