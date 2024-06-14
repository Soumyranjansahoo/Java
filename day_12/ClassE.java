//Write a Java program to merge two sorted arrays into a single sorted array.
import java.util.Scanner;
public class ClassE{
	//merging 2 array
	public static int[] meth(int arr1[],int arr2[],int size){
		int arr3[]=new int[2*size];
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<size;j++){
			if(i<size){
				arr3[i]=arr1[i];
			}
			else if(i>=size){
				arr3[i]=arr2[j];
			}
			}
		}
		arr3=meth3(arr3);
		return arr3;
		

	}

	//user input
        public static int[] meth2(int size){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
       		}
		arr=meth3(arr);
		return arr;
	}

	//sorting an array
	public static int[] meth3(int arr[]){
       		int temp=0;
      	        for(int i=0;i<arr.length-1;i++){
	           for(int j=0;j<arr.length-1;j++){
		      if(arr[j]<arr[j+1]){
		       temp=arr[j];
		       arr[j]=arr[j+1];
		       arr[j+1]=temp;
		       }
		   }
		}
		       return arr;
	}
	//Scanner sc=new Scanner(System.in);
	//main method
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of array");
		int size=sc.nextInt();
                System.out.println("enter 1st array element");
		int arr1[]=meth2(size);
		System.out.println("enter 2nd array element");
		int arr2[]=meth2(size);
		int arr3[]=meth(arr1,arr2,size);
		for(int i:arr3){
			System.out.print(i);
		}
	}
}
	
	
