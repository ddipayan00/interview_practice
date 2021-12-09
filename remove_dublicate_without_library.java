import java.util.*;
public class Main {
    public static int removeDublicate(int[] arr, int n){
        if( n == 0 || n == 1 ){
		    return n;
		}
		int temp[] = new int[n];
		int j = 0;
		for(int i=0;i<n-1;i++){
		    if(arr[i] != arr[i+1]){
		        temp[j++] = arr[i];
		    }
		}
		temp[j++] = arr[n-1];
		for(int i=0;i<j;i++){
		    arr[i] = temp[i];
		}
		return j;
		
    }
	public static void main(String[] args) {
	  // How are duplicates removed from an array without using any library?
		int arr[] = {1,5,1,2,4,9,6,3,7,7};
		Arrays.sort(arr);
		int n = arr.length;
		n = removeDublicate(arr,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
