package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		String str = "Welcome to Erode";
		System.out.println(str.length());
	/*	System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		System.out.println("------------");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));*/
//		
//			
//		}
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
			
			
		}

	}

}
