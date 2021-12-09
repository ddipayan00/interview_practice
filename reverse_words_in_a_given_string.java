import java.util.*;
class Main {
    public static void main(String [] args) {
      // Reverse words in a given string
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    ArrayList<String> s = new ArrayList<String>();
	    String temp = "";
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i) == '.'){
	            s.add(temp);
	            temp= "";
	        }
	        else{
	            temp += str.charAt(i);
	        }
	    }
	    if(temp != ""){
	        s.add(temp);
	    }
	    for(int i = s.size()-1;i>=0;i--){
	        if(i==0){
	            System.out.print(s.get(i));
	        }
	        else{
	            System.out.print(s.get(i) + "."); 
	        }
	    }
	    // i.like.this.program.very.much
	}
}
