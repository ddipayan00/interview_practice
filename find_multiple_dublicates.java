import java.util.*;
public class Main {
	public static void main(String[] args) {
	    // How do you find duplicate numbers in an array if it contains multiple duplicates?
		int arr[] = {2,7,2,5,5,8,4,7,9,3,11,2};
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
		    int x = arr[i];
		    if(mp.containsKey(x)){
		        int y = mp.get(x);
		        mp.put(x,y+1);
		    }
		    else{
		        mp.put(x,1);
		    }
		}
		for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
		    if(entry.getValue()>1){
		        System.out.print(entry.getKey()+" ");
		    }
		}
	}
}
