package Stringmethods;

public class PrintTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "banglore";
		    for(int i=0; i<str.length(); i++) {
		      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
		          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
		          str.charAt(i) == 'u')
		        
		        System.out.println("Given string contains " + 
		            str.charAt(i)+" at the index " + i);
		    }
		  }

}
