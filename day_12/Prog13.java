//Write a Java program to merge two sorted arrays into a single sorted array.
import java.util.Scanner;
public class Prog13{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of an array");
                int size=sc.nextInt();
                System.out.println("enter an elements of array");
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
		for(int i=0;i<size-1;i++){
                        for(int j=0;j<size-1;j++){
                                if(arr[j]<arr[j+1]){
                                        int temp=arr[j+1];
                                        arr[j+1]=arr[j];
                                        arr[j]=temp;
                                }
                        }
                }								
                System.out.println("enter an elements for second array");
                int arr2[]=new int[size];
                for(int i=0;i<size;i++){
  		   arr2[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++){
                        for(int j=0;j<size-1;j++){
                                if(arr2[j]<arr2[j+1]){
                                        int temp=arr2[j+1];
                                        arr2[j+1]=arr2[j];
                                        arr2[j]=temp;
                                }
                        }
                }
		int arr3[]=new int[2*size];
		for(int i=0;i<size;i++){
                        arr3[i]=arr[i];
                }

		for(int i=0;i<size;i++){
			arr3[size+i]=arr2[i];
		}
		for(int i=0;i<arr3.length-1;i++){
                        for(int j=0;j<arr3.length-1;j++){
                                if(arr3[j]<arr3[j+1]){
                                        int temp=arr3[j+1];
                                        arr3[j+1]=arr3[j];
                                        arr3[j]=temp;
                                }
                        }
               }

		System.out.println("the merged array is given below:");
		for(int i:arr3){
			System.out.print(" "+i);
		}
		
	sc.close();
	}
}
			
                    
