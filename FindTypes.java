package week3.day2;

import java.util.ArrayList;
import java.util.List;

import io.netty.handler.codec.http.HttpHeaders.Values;

public class FindTypes {

	public static void main(String[] args) {
		
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] findTypes = test.toCharArray();
		List<Character> values = new ArrayList<Character>();
		for (char c : findTypes) {
			values.add(c);
			if(Character.isLetter(c)&& Character.isDigit(c)&&Character.isSpaceChar(c)) {
				System.out.print("The condition is true");
			}else {
				System.out.print("Consider as special character ");
			}
			
			
		}
		System.out.println(" ");
		System.out.println(values);
		
		
		/*
		 * System.out.println(test.charAt(2)); for ( letter = 0; letter <test.length();
		 * letter++) { System.out.println(letter);
		 * 
		 * } System.out.println("**************");
		 */
		/*for ( int i  = 0; i <test.length(); i++) {
		
				System.out.println(i);*/
		
			
			
		/* } */
		
		

	}

}
