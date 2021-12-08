import java.util.*;
public class Main {
	public static void main(String[] args) {
		// How is a bubble sort algorithm implemented?
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,7,1,6,9,0,5};
		System.out.println("Before Sort : ");
		for(int x : arr){
		    System.out.print(x+" ");
		}
		for(int i=0;i<arr.length;i++){
		    for(int j=i;j<arr.length;j++){
		        if(arr[i] > arr[j]){
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		System.out.println("\nAfter Sort : ");
		for(int x : arr){
		    System.out.print(x+" ");
		}
		
	}
}
