import java.util.*;
public class Main {
	public static void main(String[] args) {
		// How to print the first non-repeated character from a string?
		Scanner sc = new Scanner(System.in);
		String str = "aadwkdi";
		// Using HashMap
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
		    char x = str.charAt(i);
		    if(mp.containsKey(x)){
		        int y = mp.get(x);
		        mp.put(x,y+1);
		    }
		    else{
		        mp.put(x,1);
		    }
		}
		for(int i=0;i<str.length();i++){
		    char x = str.charAt(i);
		    if(mp.get(x)==1){
		        System.out.print("Using HashMap : "+x);
		        break;
		    }
		}
		// Using Loop
		for(int i=0;i<str.length();i++){
		    boolean flag = false;
		    for(int j=0;j<str.length();j++){
		        if(str.charAt(i) == str.charAt(j) && i != j ){
		            flag = true;
		            break;
		        }
		    }
		    if(flag == false){
		        System.out.print("\nUsing Loop : "+str.charAt(i));
		        break;
		    }
		}
	}
}
