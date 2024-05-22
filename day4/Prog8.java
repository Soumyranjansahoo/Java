//Write a program to input any alphabet and check whether it is vowel or consonant
import java.util.Scanner;
public class Prog8{
	void meth1(char c){
	if(c=='a' || c=='e' || c=='i' ||c=='o'||c=='u'||c=='A'|| c=='E' || c=='I' ||c=='O'||c=='U'){
		System.out.println("The given Alphabet is Vowel");
	}
	else{
		System.out.println("The given Alphabet is consonant");
	}
	}
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Any Alphabet");
	char c=sc.next().charAt(0);
	if(c>='a' && c<='z' || c>='A'&& c<='z'){
		new Prog8().meth1(c);
	}
	else
	System.out.println("this is not a Alphabet");
	}
}






