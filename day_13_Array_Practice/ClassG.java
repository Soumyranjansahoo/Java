//Write a Java program to rotate an array to the right by a given number of steps.
import java.util.Scanner;
import java.util.Arrays;
public class ClassH{
      public static void main(String[] args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the size of an array");
	      int size=sc.nextInt();
	      System.out.println("enter the elements of an array");
	      int arr[]=new int[size];  
	      for(int i=0;i<size;i++){
		      arr[i]=sc.nextInt();
	      }
	      System.out.println("enter the steps");
	      int steps=sc.nextInt();
	      System.out.println("Original Array: " + Arrays.toString(array));
              rotateArray(array, steps);
              System.out.println("Rotated Array: " + Arrays.toString(array));
            }

           public static void rotateArray(int[] array, int steps) {
           int n = array.length;
           steps = steps % n; // Normalize steps if greater than array length
        
        // Reverse the entire array
        reverse(array, 0, n - 1);
        
        // Reverse the first part
        reverse(array, 0, steps - 1);
        
        // Reverse the second part
        reverse(array, steps, n - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
}
