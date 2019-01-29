package learning.stringbuilder.reverse;

public class Palindrome {
	
	public void checkPalindrome (String word) {
		
		StringBuilder sb = new StringBuilder(word);
		
		sb.reverse();
		
		if (word.equals(sb.toString())) {
			System.out.println("The word '" + word + "' is a palindrome");
		}
		else {
			System.out.println("The word '" + word + "' is not a palindrome");
		}
		
	}

}
