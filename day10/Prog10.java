//Write a program to find lcm of any num
import java.util.Scanner;

public class Prog10 {

    // Method to calculate the Greates Common divisor of two numbers using iteration
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate the LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Method to calculate the LCM of an array of numbers
    public static int lcm(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Input the number of elements
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        // Input the elements
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calculate LCM
        int result = lcm(numbers);

        // output the result
        System.out.println("The LCM of the given numbers is: " + result);
    }
}

