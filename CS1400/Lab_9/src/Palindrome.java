public class Palindrome {
	
	public static boolean isPalindrome(String text) {
		if (text.length() == 0 || text.length() == 1) {
			return true;
		} else {
			if (text.charAt(0) == text.charAt(text.length()-1)) {
				System.out.println("Text: " + text);
				return isPalindrome(text.substring(1, text.length()-1));
			} else {
				return false;
			}
		}
		
	}

}