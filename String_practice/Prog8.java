//8. Write a Java program to check if a string contains a substring.
import java.util.Scanner;
public class Prog8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String value");
		String s=sc.nextLine();
		s=s.toUpperCase();
                System.out.println("enter the SubString ");
		String s2=sc.next();
		s2=s2.toUpperCase();
	//	for(int i=0;i<s.length();i++)
	//	{
		 for(int j=0;j<s.length();j++)
		 {
		  if(s.substring(j,s.length()).equals(s2)){
			  System.out.println("This Substring is contains from the String");
			  break;
	//	  }
		 }
		}
		sc.close();
	}
}

			
