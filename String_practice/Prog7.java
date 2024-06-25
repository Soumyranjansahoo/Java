//Write a Java program to find the number of vowels and consonants in a string.
import java.util.Scanner;
public class Prog7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String value for checking the num of  vowels");
		String s=sc.next();
		int count=0;
		String s1=s.toUpperCase();
		for(int i=0;i<s.length();i++){
		if(s1.charAt(i)=='A' ||s1.charAt(i)=='E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' ||s1.charAt(i) =='U'){
			count++;
		}
		}
		System.out.println("The number of vowels are "+count);
		sc.close();
			
	}
}

