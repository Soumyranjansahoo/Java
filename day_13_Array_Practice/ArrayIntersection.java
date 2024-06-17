//Write a Java program to find the intersection of two arrays.
public class ArrayIntersection {

    // Function to find the intersection of two arrays
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Assuming the arrays are not sorted and have no duplicates for simplicity
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] tempIntersection = new int[Math.min(n1, n2)];
        int index = 0;
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if element is already in the intersection array
                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {
                        if (tempIntersection[k] == arr1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        tempIntersection[index++] = arr1[i];
                    }
                }
            }
        }
        
        // Create the result array with the exact size of the intersection
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = tempIntersection[i];
        }
        
        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        
        int[] intersection = findIntersection(arr1, arr2);
        
        System.out.print("The intersection of the arrays is: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}

