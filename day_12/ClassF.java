import java.util.Scanner;

public class ClassF {
    // Merging two arrays
    public static int[] meth(int arr1[], int arr2[], int size) {
        int arr3[] = new int[2 * size];
        for (int i = 0; i < size; i++) {
            arr3[i] = arr1[i];
            arr3[size + i] = arr2[i];
        }
        arr3 = meth3(arr3);
        return arr3;
    }

    // User input
    public static int[] meth2(int size) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        arr = meth3(arr);
        return arr;
    }

    // Sorting an array
    public static int[] meth3(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter 1st array element");
        int arr1[] = meth2(size);
        System.out.println("Enter 2nd array element");
        int arr2[] = meth2(size);
        int arr3[] = meth(arr1, arr2, size);
        System.out.println("Merged and sorted array:");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
 
