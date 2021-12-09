import java.util.*;
public class Main {
	public static void main(String[] args) {
    // How do you remove duplicates from an array in place?
		int arr[] = {1,5,1,2,4,9,6,3,7,7};
		ArrayList<Integer> a = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
		    int x = arr[i];
		    if(!set.contains(x)){
		        a.add(x);
		        set.add(x);
		    }
		}
		arr = null;
		arr = new int[a.size()];
		for(int i=0;i<a.size();i++){
		    arr[i] = a.get(i);
		    System.out.print(arr[i]+" ");
		}
	}
}
