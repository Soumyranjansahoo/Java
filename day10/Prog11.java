//Write a program for lcm of given num
import java.util.Scanner;
public class Prog11{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 digit");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		// Calculate LCM
       		 int result = lcm(n1, n2, n3);

        // Output the result
        System.out.println("The LCM of " + n1 + ", " + n2 + ", and " + n3 + " is " + result);

	}
		
	// Method to calculate the Greatest Common Divisor of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to calculate the LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Method to calculate the LCM of three numbers
    public static int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }


			
}    
