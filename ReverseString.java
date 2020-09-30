package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		System.out.println(test.charAt(0));
		for (int i = test.length()-1; i >=0; i--) {
			System.out.println(test.charAt(i));
			
		}
		
		 
		  char[] ch = test.toCharArray(); System.out.println(ch); 
		  for (int i =ch.length -1; i >=0; i--) { 
			  System.out.println(i);
		  
		  }
		 

	}

}
