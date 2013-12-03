import java.util.Scanner;

/**
 * Find the longest palindrome substring of a given string
 * 
 * @author Davide Romito
 * 
 */

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
		String palindromeString = null;
		Scanner sc = new Scanner(System.in);
		palindromeString = lps.findLongestPalindromeSubstring(sc.next());
		sc.close();
		System.out.println(palindromeString);
	}

	private String findLongestPalindromeSubstring(String s) {
		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (isPalindrome(s.substring(j, s.length() - i + j + 1)
						.toCharArray())) {
					return s.substring(j, s.length() - i + j + 1);
				}
			}
		}
		return null;
	}

	private boolean isPalindrome(char[] cArr) {
		for (int i = 0, j = cArr.length - 1; i < cArr.length / 2; i++, j--) {
			if (cArr[i] != cArr[j]) {
				return false;
			}
		}
		return true;
	}

}
